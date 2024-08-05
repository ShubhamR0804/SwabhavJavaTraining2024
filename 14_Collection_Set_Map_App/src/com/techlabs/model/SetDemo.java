package com.techlabs.model;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetDemo {
	
	public static void main(String[] args) {
		
		Set<Integer> set1 = new HashSet<Integer>();
		
		LinkedHashSet<Integer> linkedSet = new LinkedHashSet<>();
		TreeSet<Integer> treeSet = new TreeSet<>();
		
		set1.add(1);
		set1.add(2);
		set1.add(3);
		set1.add(4);
		set1.add(5);
		set1.add(6);
		System.out.println("The first set is "+set1);
		
		Set<Integer> set2 = new HashSet<Integer>();
		
		set2.addAll(set1);
		System.out.println("The second set is "+set2);
		
		set1.containsAll(set2);
		System.out.println("The second set is "+set1);
		
		treeSet.add(5);
		treeSet.add(51);
		treeSet.add(50);
		treeSet.add(10);
		treeSet.add(28);
		treeSet.add(2);
		
		System.out.println("The tree set is "+treeSet);
		boolean val = set1.equals(set2);
		System.out.println(val);
		
		linkedSet.add(3);
		}

}
