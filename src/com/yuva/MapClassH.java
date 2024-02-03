
package com.yuva;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MapClassH {
public static void main(String[] args) {
Map<Character, Float> s=new HashMap<>();
s.put('A', 0.5f);
s.put('B', null);
s.put('C', null);
s.put(null,0.8f);
System.out.println(s);

int s1 = s.size();
System.out.println(s1);

Float f = s.get('A');
System.out.println(f);

Set<Character> ks = s.keySet();
System.out.println(ks);

Collection<Float> v = s.values();
System.out.println(v);

boolean ck = s.containsKey(null);
System.out.println(ck);

boolean cv = s.containsValue(0.5f);
System.out.println(cv);

Set<Entry<Character, Float>> es = s.entrySet();
System.out.println(es);






}
}
