package com.yuva;

import java.util.Collection;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class MapClassT {
public static void main(String[] args) {
Map<String, Integer> s= new TreeMap<>();
s.put("A", 1);
s.put("B", 2);
s.put("C", null);
s.put("D", null);
System.out.println(s);

int s1 = s.size();
System.out.println(s1);

Integer i = s.get("B");
System.out.println(i);

Set<String> ks = s.keySet();
System.out.println(ks);

Collection<Integer> v = s.values();
System.out.println(v);

boolean ck = s.containsKey("T");
System.out.println(ck);

boolean cv = s.containsValue(null);
System.out.println(cv);

Set<Entry<String, Integer>> es = s.entrySet();
System.out.println(es);




}

}
