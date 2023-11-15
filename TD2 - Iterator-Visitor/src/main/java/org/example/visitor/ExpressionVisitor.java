package org.example.visitor;


import org.example.BinaryExpression;
import org.example.NumberExpression;

public interface ExpressionVisitor {

    void visit(NumberExpression exp);

    void visit(BinaryExpression exp);
}
