package org.example.iterator;


import org.example.Expression;

// Interface définissant les méthodes pour parcourir un arbre d'expression
public interface ExpressionIterator {

    boolean hasNext();

    Expression next();
}
