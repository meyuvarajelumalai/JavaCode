package com.yuva;

import java.util.LinkedHashMap;
import java.util.Map;

public class RepeatWord {
public static void main(String[] args) {
String s = "I WILL DO MY LEVEAL BEST";
String[] sp = s.split(" ");

Map<String, Integer> m=new LinkedHashMap<>();
for (String str : sp) {
	if (m.containsKey(str)){
		
		Integer i= m.get(str);
		m.put(str, i+1);
		
	}else {
		m.put(str, 1);
	}

}
System.out.println(m);
}
}
