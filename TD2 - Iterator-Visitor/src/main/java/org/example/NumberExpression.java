package org.example;

import org.example.visitor.ExpressionVisitor;

public class NumberExpression extends Expression {

    private int number;

    public NumberExpression(int number) {
        this.number = number;
    }

    public int getNumber() {
        return number;
    }

    public void accept(ExpressionVisitor visitor) {
        visitor.visit(this);
    }
}