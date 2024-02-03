package com.yuva;

import java.util.Arrays;
import java.util.Iterator;

public class ArrayNumbers {
public static void main(String[] args) {
int a[]= {20,12,90,30,50,10};
Arrays.sort(a);
System.out.println("Stored Array Value is:");
for (int i = 0; i < a.length; i++) {
	System.out.println(a[i]);
}
System.out.println("1st Minimun Value is:"+a[0]);
System.out.println("1st Maximum Value is:" + a[a.length-1]);
System.out.println("2nd Minimun Value is:"+a[1]);
System.out.println("2nd Maximum Value is:" + a[a.length-2]);
System.out.println("3rd Maximum Value is:" + a[a.length-3]);
}
}	
//for (int i = 0; i <= 6; i++) {
//
//	for (int j = 0; j <=6  ; j++) {
//		System.out.print(" *");
//	}
//	System.out.println();
//}	
//}
//}

