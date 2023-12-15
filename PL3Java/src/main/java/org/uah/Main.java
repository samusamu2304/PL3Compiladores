package org.uah;

import hu.webarticum.treeprinter.SimpleTreeNode;
import hu.webarticum.treeprinter.printer.listing.ListingTreePrinter;
import linguine.LinguineLexer;
import linguine.LinguineParser;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("#=========================================================#");
        System.out.println("|                  Bienvenido a Linguine                  |");
        System.out.println("#=========================================================#");
        System.out.println();

        InputStream is = System.in;
        String inputFile = "FicherosEjemplo/example.prog";//Solo sirve en el IDE
        if (args.length >= 1){
            if (args[0].contains("-txt")){
                Scanner sc = new Scanner(is);
                System.out.println("> Leyendo código desde la entrada estándar.");
                System.out.println("> Introduzca el texto a analizar:");
                String codigo = "";
                while (sc.hasNextLine()){
                    codigo += sc.nextLine()+"\n";
                }
                sc.close();
                try {
                    FileWriter myWriter = new FileWriter("codigo.prog");
                    BufferedWriter bw = new BufferedWriter(myWriter);
                    bw.write(codigo);
                    bw.close();
                    myWriter.close();
                    inputFile = "codigo.prog";
                } catch (IOException e) {
                    System.out.println(e.getMessage());
                }
            }else{
                inputFile = args[0];
                System.out.println("> Leyendo código desde el archivo " + inputFile);
            }
        }
        else{
            System.out.println("> Leyendo código desde el archivo " + inputFile);
        }

        ANTLRInputStream input = null;
        try {
            is = new FileInputStream(inputFile);
            input = new ANTLRInputStream(is);
        }catch (IOException e){
            System.out.println(e.getMessage());
        }

        System.out.println("> Comprobando sintaxis del código");

        LinguineLexer lexer = new LinguineLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        LinguineParser parser = new LinguineParser(tokens);
        ParseTree tree = parser.program();
        ParseTreeWalker walker = new ParseTreeWalker();
        TablaSimbolos tablaSimbolos = new TablaSimbolos();
        TreeListener listener = new TreeListener(tablaSimbolos);
        // System.out.println("\n\n");
        // System.out.println("Tabla de variables");
        // walker.walk(listener, tree);
        //GeneradorDeArboles generadorDeArboles = new GeneradorDeArboles(tree,parser);
        //SimpleTreeNode rootNode = generadorDeArboles.generarArbol();

        // System.out.println("\n\n");
        // new ListingTreePrinter().print(rootNode);
        //
        //Descomentar para probar
        //addStringFunctions(tablaSimbolos);
        LingVisitor visitor = new LingVisitor(tablaSimbolos, parser);
        String jasmineCode = visitor.visit(tree);

        System.out.println();

        String jasminFile = createJasminFile(jasmineCode);
        jasminFile += tablaSimbolos.getFunciones();

        System.out.println("--------------- Código intermedio generado ----------------");
        System.out.println(jasminFile);
        try {
            FileWriter myWriter = new FileWriter("codigo.j");
            BufferedWriter bw = new BufferedWriter(myWriter);
            bw.write(jasminFile);
            bw.close();
            myWriter.close();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

        tablaSimbolos.printTabla();

    }
    private static String createJasminFile(String instructions) {
        return ".class public Linguine\n"
                + ".super java/lang/Object\n"
                + "\n"
                + ".method public static main([Ljava/lang/String;)V\n"
                + "   .limit stack 100\n"
                + "   .limit locals 100\n"
                + "\n"
                + instructions + "\n"
                + "return\n"
                + "\n"
                + ".end method\n";
    }

    private static void addStringFunctions(TablaSimbolos ts){
        String args = "Ljava/lang/String;Ljava/lang/String;";

        String copyFunc = "\n"
        + ".method public static copy(Ljava/lang/String;)Ljava/lang/String;\n"
                + ".limit stack 100\n"
                + ".limit locals 100\n"
                + "aload 0\n"
                + "invokespecial java/lang/String/<init>(Ljava/lang/String;)V\n"
                + "areturn\n"
                + ".end method\n";
        ts.addFuncion("copy", "string",0, null, args, copyFunc);

        String concatFunc = "\n"
            + ".method public static concat(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;\n"
            + ".limit stack 100\n"
            + ".limit locals 100\n"
            + "aload_0\n"
            + "aload_1\n"
            + "new java/lang/StringBuilder\n"
            + "dup\n"
            + "invokespecial java/lang/StringBuilder/<init>()V\n"
            + "aload_0\n"
            + "invokevirtual java/lang/StringBuilder/append(Ljava/lang/String;)Ljava/lang/StringBuilder;\n"
            + "aload_1\n"
            + "invokevirtual java/lang/StringBuilder/append(Ljava/lang/String;)Ljava/lang/StringBuilder;\n"
            + "invokevirtual java/lang/StringBuilder/toString()Ljava/lang/String;\n"
            + "areturn\n"
            + ".end method\n";
        ts.addFuncion("concat", "string",0, null, args, concatFunc);

        String substractFunc = "\n"
            + ".method public static substract(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;\n"
            + ".limit stack 100\n"
            + ".limit locals 100\n"
            + "aload_0\n"
            + "aload_1\n"
            + "ldc \"\"\n"
            + "invokevirtual java/lang/String/replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;\n"
            + "areturn\n"
            + ".end method\n";
        ts.addFuncion("substract", "string",0, null, args, substractFunc);

        String getcharFunc = "\n"
            + ".method public static getchar(Ljava/lang/String;I)C\n"
            + ".limit locals 100\n"
            + ".limit stack 100\n"
            + "aload_0\n"
            + "iload_1\n"
            + "invokevirtual java/lang/String.charAt(I)C\n"
            + "ireturn\n"
            + ".end method\n";
        ts.addFuncion("getchar", "string",0, null, args, getcharFunc);
/**Rompe el programa
        String setcharFunc = "\n"
            + ".method public static setchar(Ljava/lang/String;II)Ljava/lang/String;\n"
            + ".limit locals 4\n"
            + ".limit stack 4\n"
            + "aload_0\n"
            + "iload_1\n"
            + "iload_2\n"
            + "invokestatic java/lang/String/valueOf(I)Ljava/lang/String;\n"
            + "invokevirtual java/lang/String.substring(I)Ljava/lang/String;\n"
            + "invokevirtual java/lang/String.concat(Ljava/lang/String;)Ljava/lang/String;\n"
            + "aload_0\n"
            + "iload_1\n"
            + "iconst_1\n"
            + "iadd\n"
            + "invokevirtual java/lang/String.substring(I)Ljava/lang/String;\n"
            + "invokevirtual java/lang/String.concat(Ljava/lang/String;)Ljava/lang/String;\n"
            + "areturn\n"
            + ".end method\n";
        ts.addFuncion("setchar", "string",0, null, args, setcharFunc);
**/
        String getlenFunc = "\n"
            + ".method public static getlen(Ljava/lang/String;)I\n"
            + "aload_0\n"
            + "invokevirtual java/lang/String.length()I\n"
            + "ireturn\n"
            + ".end method\n";
        ts.addFuncion("getlen", "string",0, null, args, getlenFunc);
    }
}