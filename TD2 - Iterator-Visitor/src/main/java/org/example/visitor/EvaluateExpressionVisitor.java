package org.example.visitor;

import org.example.BinaryExpression;
import org.example.NumberExpression;

public class EvaluateExpressionVisitor implements ExpressionVisitor {

    private int resultat;

    @Override
    public void visit(NumberExpression exp) {
        resultat = exp.getNumber();
    }

    @Override
    public void visit(BinaryExpression exp) {
        exp.getLeftExp().accept(this);
        int leftResult = getResult();
        exp.getRightExp().accept(this);
        int rightResult = getResult();
        switch (exp.getOperation()) {
            case PLUS -> resultat = leftResult + rightResult;
            case MINUS -> resultat = leftResult - rightResult;
            case TIMES -> resultat = leftResult * rightResult;
        }
    }

    public int getResult() {
        return resultat;
    }
}