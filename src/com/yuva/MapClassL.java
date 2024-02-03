package com.yuva;

import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MapClassL {
public static void main(String[] args) {
	Map<String,Integer> s=new LinkedHashMap<>();
	s.put("A", 1);
	s.put(null, 2);
	s.put("C", null);
	s.put("B", null);
	System.out.println(s);

	int s1 = s.size();
	System.out.println(s1);
	
	Integer i = s.get("B");
	System.out.println(i);
	
	Set<String> ks = s.keySet();
	System.out.println(ks);
	
	Collection<Integer> v = s.values();
	System.out.println(v);
	
	boolean ck = s.containsKey(null);
	System.out.println(ck);
	
	boolean cv = s.containsValue(null);
	System.out.println(cv);
	
	Set<Entry<String, Integer>> es = s.entrySet();
	System.out.println(es);
	
	
	
	
}
}
