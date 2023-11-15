package org.example;

import org.example.iterator.LargeurIterator;
import org.example.iterator.ProfondeurIterator;
import org.example.visitor.ExpressionVisitor;

public abstract class Expression {

    public LargeurIterator iteratorLargeur() {
        return new LargeurIterator(this);
    }

    public ProfondeurIterator iteratorProfondeur() {
        return new ProfondeurIterator(this);
    }

    public abstract void accept(ExpressionVisitor visitor);
}