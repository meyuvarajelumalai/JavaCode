package com.yuva;

public class SperateValue {
public static void main(String[] args) {
	String y = "yuvaraj007@gmail.com";
	String Splcharater = y.replaceAll("[0-9,a-z]", "");
	System.out.println("Special character is: "+Splcharater);
	String Num = y.replaceAll("[^0-9]", "");
	System.out.println("Number is: "+Num);
	String cha = y.replaceAll("[^a-z]", "");
	System.out.println("character is: "+cha);
}
}