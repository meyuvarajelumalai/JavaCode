package com.yuva;

public class CondiionClass {
	public static void main(String[] args) {
		int i = 81;
		if (i <= 0) {
			System.out.println("Condition pass");
		} else if (i >= 51 && i <= 60) {
			System.out.println("E  grade");
		} else if (i >= 61 && i <= 70) {
			System.out.println("D  grade");
		} else if (i >= 71 && i <= 80) {
			System.out.println("C grade");
		} else if (i >= 81 && i <= 90) {
			System.out.println("B grade");
		} else if (i >= 91 && i <= 100) {
			System.out.println("A grade");
		} else {
			System.out.println("Invalid number");
		}
	}
}
