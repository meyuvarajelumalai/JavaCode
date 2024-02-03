package com.yuva;

import java.util.Iterator;

public class WordRevers {
public static void main(String[] args) {
	String y="I am java Developer";
	String words[] = y.split(" "+ "");
    String rS = "";
    for (int i=0; i<words.length; i++) {
    	rS=words[i]+" "+rS;
}  
System.out.println("Reversed sentence is: " + rS);
}
}








