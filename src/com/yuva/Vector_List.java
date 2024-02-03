package com.yuva;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

public class Vector_List {
public static void main(String[] args) {
List<Character> y=new Vector<>();
y.add('A');
y.add('B');
y.add('C');
System.out.println(y);

int s=y.size();
System.out.println(s);

int s1 = y.get(0);
System.out.println(s1);

int io = y.indexOf('A');
System.out.println(io);

boolean c = y.contains('B');
System.out.println(c);

y.set(1,'d');
System.out.println(y);

//y.remove(0);
//System.out.println(y);

//y.clear();
//System.out.println(y);

List<Character> y1=new Vector<>();
y1.add('d');
y1.add('e');
y1.add('f');
System.out.println(y1);

//y1.addAll(y);
//System.out.println(y1);

//y1.retainAll(y);
//System.out.println(y1);

y1.removeAll(y);
System.out.println(y1);
}
}

