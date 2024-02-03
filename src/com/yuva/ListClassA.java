package com.yuva;

import java.util.ArrayList;
import java.util.List;

public class ListClassA {
public static void main(String[] args) {
List<String> y=new ArrayList<>();
y.add("YUVI");
y.add("RAJA");
y.add(0,"KUMAR");
System.out.println(y);

int s=y.size();
System.out.println(s);

String s1 = y.get(0); 
System.out.println(s1);

int io = y.indexOf("YUVI");
System.out.println(io);

boolean c = y.contains("RAJA");
System.out.println(c);

y.set(1,"YUVI");
System.out.println(y);

//y.remove(0);
//System.out.println(y);

//y.clear();
//System.out.println(y);

List<String> y1=new ArrayList<>();
y1.add("A");
y1.add("B");
y1.add("C");
System.out.println(y1);

//y1.addAll(y);
//System.out.println(y1);

//y1.retainAll(y);
//System.out.println(y1);

y1.removeAll(y);
System.out.println(y1);
}
}
