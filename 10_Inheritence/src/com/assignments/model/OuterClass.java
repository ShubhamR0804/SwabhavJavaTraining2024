package com.assignments.model;

public class OuterClass {

	// Static variable for the static nested class
	private static String staticVariable = "Static Variable";

	// Instance variable for the inner class
	private String instanceVariable = "Instance Variable";

	// Static nested class
	public static class StaticNestedClass {
		public void displayStatic() {
			// Can access the static variable of the outer class
			System.out.println("StaticNestedClass accessing: " + staticVariable);
		}
	}

	// Inner class
	public class InnerClass {
		public void displayInner() {
			// Can access both static and instance variables of the outer class
			System.out.println("InnerClass accessing: " + staticVariable);
			System.out.println("InnerClass accessing: " + instanceVariable);
		}
	}

	public static void main(String[] args) {
		// Create an instance of the static nested class
		OuterClass.StaticNestedClass staticNestedInstance = new OuterClass.StaticNestedClass();
		staticNestedInstance.displayStatic();

		// Create an instance of the outer class to create an instance of the inner
		// class
		OuterClass outerInstance = new OuterClass();
		OuterClass.InnerClass innerInstance = outerInstance.new InnerClass();
		innerInstance.displayInner();
	}
}
