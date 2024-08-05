package com.techlabs.model;

import java.util.Map;
import java.util.HashMap;

public class MapDemo {
	
	public static void main(String[] args) {
		
		Map<String, Integer> map = new HashMap<String, Integer>();
		map.put("A", 10);
		map.put("B", 20);
		map.put("C", 30);
		map.put("D", 40);
		map.put("E", null);
		map.put(null, 100);
		map.putIfAbsent("A", 50);
		map.putIfAbsent("E", 50);
		
		System.out.println(map);
	}

}
