package com.yuva;

public class Bulider {
public static void main(String[] args){
	StringBuilder s=new StringBuilder("Yuvaraj");
	System.out.println(System.identityHashCode(s));

	StringBuilder s1=new StringBuilder("Yuvaraj");
	System.out.println(System.identityHashCode(s1));

	System.out.println(System.identityHashCode(s1.append(s)));
	}
	}

