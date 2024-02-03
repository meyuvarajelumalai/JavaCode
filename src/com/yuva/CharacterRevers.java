package com.yuva;

public class CharacterRevers {
	public static void main(String[] args) {
	String y="Welcome to java";
	String words[] = y.split(" ");
    String reversedString = "";
    for (int i = 0; i < words.length; i++) 
    {
      String word = words[i];
      String reverseWord = "";
      for (int j = word.length()- 1; j >=0; j--) {
        reverseWord = reverseWord + word.charAt(j);
      }
     reversedString = reversedString + reverseWord + " ";
    } 
 System.out.print("Reversed Character is: " + reversedString);
  }
}