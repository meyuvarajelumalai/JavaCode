package com.yuva;

import java.util.LinkedHashSet;
import java.util.Set;

public class SetClassLink {
public static void main(String[] args) {
	Set<Object> y=new LinkedHashSet<>();
	y.add('A');
	y.add(null);
	y.add(12);
	y.add(123);
	System.out.println(y);
	int y1=y.size();
	System.out.println(y1);
	boolean c=y.contains(null);
	System.out.println(c);
	//y.clear();
	//System.out.println(y);
	Set<Object> y2=new LinkedHashSet<>();
	y2.add('B');
	y2.add(null);
	y2.add(11);
	y2.add(124);
	System.out.println(y2);
	//y2.addAll(y);
	//System.out.println(y2);
	//y2.retainAll(y);
	//System.out.println(y2);
	y2.removeAll(y);
	System.out.println(y2);
}
}
