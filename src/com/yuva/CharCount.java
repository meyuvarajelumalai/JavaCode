package com.yuva;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class CharCount {
	public static void main(String[] args) {
		String s = "Welcome to java";
		String[] sp = s.split("");

		Map<String, Integer> m = new LinkedHashMap<>();

		for (String str : sp) {
			if (!str.equals(" ")) {

				if (m.containsKey(str)) {

					Integer i = m.get(str);
					m.put(str, i + 1);

				} else {
					m.put(str, 1);
				}
			}
		}
		System.out.println(m);
	}
}
