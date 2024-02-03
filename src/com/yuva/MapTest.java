package com.yuva;

import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MapTest {
public static void main(String[] args) {
Map<Integer, Integer> s = new LinkedHashMap<>();
s.put(10,10);
s.put(20,20);
s.put(30,30);
s.put(40,40);
s.put(50,50);
s.put(60,60);
s.put(10,10);
s.put(50,50);
s.put(40,40);
System.out.println(s);

int sz= s.size();
System.out.println(sz);

Integer gt = s.get(10);
System.out.println(gt);

Set<Integer> ks = s.keySet();
System.out.println(ks);

Collection<Integer> v = s.values();
System.out.println(v);

boolean ck = s.containsKey(60);
System.out.println(ck);

boolean cv = s.containsValue(50);
System.out.println(cv);

Set<Entry<Integer, Integer>> es = s.entrySet();
System.out.println(es);

}
}
