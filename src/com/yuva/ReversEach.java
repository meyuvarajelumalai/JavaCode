package com.yuva;

import java.util.Scanner;

public class ReversEach {
//	public static void main(String[] args) {
//		String y="MY NAME";
//		String raja="";
//		for (int i =y.length()-1; i>=0; i--) {
//		raja=raja+y.charAt(i);
//		}
//		System.out.println("Reversed Name of the '"+y+"'is:"+raja);
//	}
//}
	public static void main(String[] args) {
	    Scanner scanner = new Scanner(System.in);
	    System.out.print("Original string : "); 
	 
	    String originalStr = scanner.nextLine();
	    scanner.close();
	 
	    String words[] = originalStr.split(" ");
	    String reversedString = "";
	 
	    for (int i = 0; i < words.length; i++) 
	    {
	      String word = words[i];
	      String reverseWord = "";
	      for (int j = word.length() - 1; j >= 0; j--) {
	        reverseWord = reverseWord + word.charAt(j);
	      }
	      reversedString = reversedString + reverseWord + " ";
	    }
	 
	    // Displaying the string after reverse
	    System.out.print("Reversed string : " + reversedString);
	  }
	}