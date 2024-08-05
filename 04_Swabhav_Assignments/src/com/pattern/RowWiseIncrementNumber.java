package com.pattern;

public class RowWiseIncrementNumber {

	public static void main(String[] args) {

		int i;
		int j;

		for (i = 0; i <= 4; i++) {
			for (j = 0; j < i; j++) {
				System.out.print(" " + i);
			}
			System.out.println();
		}

	}
}
