package com.techlabs.strategy.model;

public class MultiplyOperation implements OperationStrategy {
    @Override
    public int doOperation(int a, int b) {
        return a * b;
    }

}
