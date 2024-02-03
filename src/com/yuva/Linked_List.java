package com.yuva;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Linked_List {
public static void main(String[] args) {
List<Integer> y=new LinkedList<>();
y.add(11);
y.add(22);
y.add(33);
System.out.println(y);

int s=y.size();
System.out.println(s);

Integer s1 = y.get(0);
System.out.println(s1);

int io = y.indexOf(11);
System.out.println(io);

boolean c = y.contains(22);
System.out.println(c);

y.set(1,33);
System.out.println(y);

//y.remove(0);
//System.out.println(y);

//y.clear();
//System.out.println(y);

List<Integer> y1=new LinkedList<>();
y1.add(33);
y1.add(43);
y1.add(53);
System.out.println(y1);

//y1.addAll(y);
//System.out.println(y1);

//y1.retainAll(y);
//System.out.println(y1);

y1.removeAll(y);
System.out.println(y1);


}
}
