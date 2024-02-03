package com.yuva;

public class Pojo_C {
	public static void main(String[] args) {
		Pojo_B b  = new Pojo_B();
		int i = b.getI();
		System.out.println(i);
		b.setI(1000);
		int i1 = b.getI();
		System.out.println(i1);
	}

}
