package com.yuva;
public class StringClass {
public static void main(String[] args) {
String s = "Hello java";
String s1 ="Hello java";
int l = s.length();
System.out.println(l);
boolean e=s.equals(s1);
System.out.println(e);
boolean eq=s.equalsIgnoreCase(s1);
System.out.println(eq);
String s2= s.toUpperCase();
System.out.println(s2);
String lc =s.toLowerCase();
System.out.println(lc);
boolean sw=s.startsWith("java");
System.out.println(sw);
boolean ew=s.endsWith("a");
System.out.println(ew);
boolean c=s.contains("r");
System.out.println(c);
int io=s.indexOf("a");
System.out.println(io);
int li=s.lastIndexOf("a");
System.out.println(li);
char at=s.charAt(1);
System.out.println(at);
String st=s.replace("Hello","Hai");
System.out.println(st);
String st2=s.substring(2);
System.out.println(st2);
boolean le=s.isEmpty();
System.out.println(le);
String str="Hello Java";
String []sp =str.split(" ");
for (String abc : sp) {
System.out.println(abc);	
}
String trim =s.trim();
System.out.println(trim);
String st3=s.substring(2,5);
System.out.println(st3);
}
}
