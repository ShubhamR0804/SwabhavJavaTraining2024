package com.techlabs.strategy.model;

public class Main {
	private OperationStrategy operation;

    // Constructor
    public Main(OperationStrategy operation) {
        this.operation = operation;
    }

    // Method to set the operation strategy
    public void setOperation(OperationStrategy operation) {
        this.operation = operation;
    }

    // Method to perform the operation based on the strategy set
    public void doOperation(int a, int b) {
        System.out.println("Result: " + operation.doOperation(a, b));
    }
}
