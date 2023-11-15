package org.example.iterator;


import org.example.Expression;

public class ProfondeurIterator implements ExpressionIterator{

    private Expression expression;

    public ProfondeurIterator(Expression exp){
        this.expression = exp;
    }

    @Override
    public boolean hasNext() {
        return false;
    }

    @Override
    public Expression next() {
        return null;
    }
}