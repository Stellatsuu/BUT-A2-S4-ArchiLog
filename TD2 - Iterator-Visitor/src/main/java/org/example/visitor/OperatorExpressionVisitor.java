package org.example.visitor;

import org.example.BinaryExpression;
import org.example.NumberExpression;

public class OperatorExpressionVisitor implements ExpressionVisitor {
    @Override
    public void visit(NumberExpression exp) {
    }

    @Override
    public void visit(BinaryExpression exp) {
    }
}