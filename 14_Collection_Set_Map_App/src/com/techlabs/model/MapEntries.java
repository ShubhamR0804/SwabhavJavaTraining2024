package com.techlabs.model;

import java.util.Map.Entry;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapEntries {

	public static void main(String[] args) {
		Map<Integer, String> map = new HashMap<Integer, String>();

		map.put(1, "Shubham");
		map.put(2, "Shivam");
		map.put(3, "Yuvi");
		map.put(4, "Gautam");
		map.put(5, null);
		map.putIfAbsent(5, "Kunal");

		System.out.println(map);

		Set<Entry<Integer, String>> entries = map.entrySet();

		for (Entry<Integer, String> entry : entries) {
			System.out.println(entry.getKey() + " : " + entry.getValue());
		}
	}
}
