package com.techlabs.model;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class AreaCalculatorTest {
	AreaCalculator calculator;
	@BeforeEach
	public void init() {
		calculator = new AreaCalculator();
	}
	

	@Test
	void testCalculateAreaOfCircle() {
		assertEquals(78.5, calculator.calculateAreaOfCircle(5));
	}

}
