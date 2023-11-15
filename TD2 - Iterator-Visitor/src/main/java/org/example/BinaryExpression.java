package org.example;

import org.example.visitor.ExpressionVisitor;

public class BinaryExpression extends Expression {

    private Expression leftExp;
    private Operator operation;
    private Expression rightExp;

    public BinaryExpression(Expression leftExp, Operator operation, Expression rightExp) {
        this.leftExp = leftExp;
        this.operation = operation;
        this.rightExp = rightExp;
    }

    public void accept(ExpressionVisitor visitor) {
        visitor.visit(this);
    }

    public Expression getLeftExp() {
        return leftExp;
    }

    public Operator getOperation() {
        return operation;
    }

    public Expression getRightExp() {
        return rightExp;
    }
}