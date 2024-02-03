package com.yuva;

public class reverse1 {
public static void main(String[] args) {
String y="Welcome to java";
String raja="";
for (int i =y.length()-1; i>=0; i--) {
raja=raja+y.charAt(i);
}
System.out.println("Reversed Name =" +raja);
}
}
