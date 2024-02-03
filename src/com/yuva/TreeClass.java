package com.yuva;

import java.util.Set;
import java.util.TreeSet;

public class TreeClass {
	public static void main(String[] args) {
		
	Set<Object> y= new TreeSet<>();
	y.add("yuvi");
	y.add("raja");
	y.add("mech");
	System.out.println(y);
	
	int sz = y.size();
	System.out.println(sz);
	
	boolean b = y.contains("mech");
	System.out.println(b);
	
	//y.clear();
	//System.out.println(y);
	
	Set<Object> y1= new TreeSet<>();
	y1.add("a");
	y1.add("b");
	y1.add("c");
	System.out.println(y1);
	
	//y.addAll(y1);
	//System.out.println(y);
	
	//y.retainAll(y1);
	//System.out.println(y);
	
	y.removeAll(y1);
	System.out.println(y);
	
	
	}

}
