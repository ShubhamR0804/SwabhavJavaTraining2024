package com.techlabs.model;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class OperationsTest {
	
	Operations operation;
	
	@BeforeEach
	void init() {
	operation = new Operations();
	}
	
	@AfterEach
	void status() {
		System.out.println("Test Finished");
	}
	
	
	@Test
	void testAddition() {

		
		assertEquals(39, operation.addition(10, 20),"This method must return addition of two numbers");
	}
	
	@Test
	void testSubtraction() {
	
		
		assertEquals(-10, operation.subtraction(10, 20), "This method is performing substraction");
	}
	
	@Test
	void testMultiplication() {
	
		
		assertEquals(20, operation.multiplication(10, 2));
	}
	
	@Test
	void testDivision() {
		
		
		assertEquals(2, operation.division(10, 5));
		assertThrows(ArithmeticException.class,()-> operation.division(10, 0));
		
	}
	
	@Test
	void testSquareOfElements() {
		int squares[] = {25,36,49};
		int numbers[] = {5,6,7};
		assertArrayEquals(squares, operation.squareOfArrayElement(numbers));
		
	}
	
	@Test
	void testIsEven()
	{
		assertTrue(operation.isEven(6));
		//assertTrue(operation.isEven(7));
	}

}
