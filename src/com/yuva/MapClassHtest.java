package com.yuva;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapClassHtest {
public static void main(String[] args) {
Map<Integer, String> s=new HashMap<>();
s.put(10,"java");
s.put(20, "sql");
s.put(30,"oops");
s.put(40, "sql");
s.put(50,"oracle");
s.put(60, "DB");
s.put(10, "selenium");
s.put(50,"psql");
s.put(40, "Hadoop");
System.out.println(s);

Set<Integer> ks=s.keySet();
System.out.println(ks);


}
}
