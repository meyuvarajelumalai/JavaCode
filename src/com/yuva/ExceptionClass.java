package com.yuva;

public class ExceptionClass {
public static void main(String[] args)throws Exception{
int i=10;
try {
System.out.println(i/0);
}
catch (Exception e) {
e.printStackTrace();
System.out.println("Yuvaraj");}
finally {
int i1=10;
System.out.println(10/3);}
for (int j=1; j <=10; j++) {
if (j==6) {
	throw new Exception();
}
System.out.println(j);
}
}
}
