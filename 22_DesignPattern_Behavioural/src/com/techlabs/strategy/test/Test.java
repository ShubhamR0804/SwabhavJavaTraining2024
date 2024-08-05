package com.techlabs.strategy.test;

import com.techlabs.strategy.model.AddOperation;
import com.techlabs.strategy.model.Main;
import com.techlabs.strategy.model.MultiplyOperation;

public class Test {
	public static void main(String[] args) {
        // Create MainClass object with AddOperation strategy
        Main mainClass = new Main(new AddOperation());
        System.out.println("Using AddOperation:");
        mainClass.doOperation(5, 3); // Output: 8

        // Change strategy to MultiplyOperation
        mainClass.setOperation(new MultiplyOperation());
        System.out.println("Using MultiplyOperation:");
        mainClass.doOperation(5, 3); // Output: 15
    }
}
