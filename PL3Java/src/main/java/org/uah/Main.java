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
        System.out.println("Linguine");
        InputStream is = System.in;
        String inputFile = "FicherosEjemplo/example.prog";//Solo sirve en el IDE
        if (args.length >= 1){
            if (args[0].contains("-txt")){
                Scanner sc = new Scanner(is);
                System.out.println("Introduzca el texto a analizar:");
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
            }
        }
        ANTLRInputStream input = null;
        try {
            is = new FileInputStream(inputFile);
            input = new ANTLRInputStream(is);
        }catch (IOException e){
            System.out.println(e.getMessage());
        }
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
        GeneradorDeArboles generadorDeArboles = new GeneradorDeArboles(tree,parser);
        SimpleTreeNode rootNode = generadorDeArboles.generarArbol();

        // System.out.println("\n\n");
        // new ListingTreePrinter().print(rootNode);
        LingVisitor visitor = new LingVisitor(tablaSimbolos, parser);
        String jasmineCode = visitor.visit(tree);
        String jasminFile = createJasminFile(jasmineCode);
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
                + ".end method";
    }
}