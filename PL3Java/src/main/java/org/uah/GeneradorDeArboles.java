package org.uah;

import hu.webarticum.treeprinter.SimpleTreeNode;
import org.antlr.v4.runtime.Parser;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ParseTree;

public class GeneradorDeArboles {
ParseTree tree;
Parser parser;
SimpleTreeNode rootNode;

    public GeneradorDeArboles(ParseTree tree, Parser parser) {
        this.tree = tree;
        this.parser = parser;
        this.rootNode = new SimpleTreeNode(parser.getRuleNames()[((ParserRuleContext) tree).getRuleIndex()]);
    }

    public SimpleTreeNode generarArbol(){
        asignarHijos(tree, rootNode);
        return rootNode;
    }
    private void asignarHijos(ParseTree tree, SimpleTreeNode node){
        for (int i = 0; i < tree.getChildCount(); i++) {
            if (!tree.getChild(i).getClass().getSimpleName().equals("TerminalNodeImpl")){
                SimpleTreeNode currentNode = new SimpleTreeNode(parser.getRuleNames()[((ParserRuleContext) tree.getChild(i)).getRuleIndex()]+" : "+tree.getChild(i).getText());
                node.addChild(currentNode);
                asignarHijos(tree.getChild(i), currentNode);
            }else{
                SimpleTreeNode currentNode = new SimpleTreeNode("terminal"+" : "+tree.getChild(i).getText());
                node.addChild(currentNode);
                asignarHijos(tree.getChild(i), currentNode);
            }


        }
    }
}
