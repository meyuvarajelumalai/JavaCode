package com.yuva;

import java.util.HashSet;
import java.util.Set;

public class Set_Class {
public static void main(String[] args) {
	Set<Object> o= new HashSet<>();
	o.add(15.5);
	o.add("Yuvaraj");
	o.add('A');
	o.add(null);
	System.out.println(o);
	
	int sz=o.size();
	System.out.println(sz);
	
	boolean c = o.contains(12345678);
	System.out.println(c);
	
	//o.clear();
	//System.out.println(o);
	
	Set<Object> o1= new HashSet<>();
	o1.add(17.5);
	o1.add("RAJA");
	o1.add('B');
	o1.add(null);
	System.out.println(o1);
	
	//o.addAll(o1);
	//System.out.println(o);
	
	//o.retainAll(o1);
	//System.out.println(o);
	
	o.removeAll(o1);
	System.out.println(o);
	
	
	
	
	
	
}
}
