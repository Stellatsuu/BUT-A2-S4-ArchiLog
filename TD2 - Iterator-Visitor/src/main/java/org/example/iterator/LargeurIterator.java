package org.example.iterator;

import org.example.BinaryExpression;
import org.example.Expression;
import org.example.NumberExpression;

public class LargeurIterator implements ExpressionIterator{

    private Expression expression;

    public LargeurIterator(Expression exp){

    }

    @Override
    public boolean hasNext() {
        return true;
    }

    @Override
    public Expression next() {
        return null;
    }
}