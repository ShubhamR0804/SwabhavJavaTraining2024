package com.poc.enumerator;
//Enumaretion is called 
import java.util.Enumeration;

public class EnumeratorProofOfConcept {

	public enum Season {Winter,Summer,Rainy}
	public static void main(String[] args) {
		for(Season s: Season.values()) {
			System.out.println(s);
		}
	}
}
