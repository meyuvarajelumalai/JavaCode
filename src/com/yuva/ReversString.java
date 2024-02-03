package com.yuva;

public class ReversString {
	public static void main(String[] args) {
		String y="Welcome";
		String reverse="";
		for (int i =y.length()-1; i>=0; i--) {
		reverse=reverse+y.charAt(i);
		}
		System.out.println("Reversed Name =" +reverse);
		}
		}

	

