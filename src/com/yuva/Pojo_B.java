package com.yuva;

public class Pojo_B {
private int i = 123;

public int getI() {
	return i;
}

public void setI(int i) {
	this.i = i;
}
public static void main(String[] args) {
	Pojo_A a = new Pojo_A();
	String y = a.getY();
	System.out.println(y);
	a.setY("Elumalai");
	String y1 = a.getY();
	System.out.println(y1);
	
	int no = a.getNo();
	System.out.println(no);
	a.setNo(900);
	int no1 = a.getNo();
	System.out.println(no1);
}
}
