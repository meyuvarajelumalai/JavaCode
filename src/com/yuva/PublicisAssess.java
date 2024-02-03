package com.yuva;
import java.util.Scanner;
public class PublicisAssess {
	

	
	    public static String removeCharactersBeforeDeleteChar(String sentence, char deleteChar) {
	        StringBuilder result = new StringBuilder();
	        
	        for (int i = 0; i < sentence.length(); i++) {
	            char currentChar = sentence.charAt(i);
	            if (currentChar == deleteChar) {
	                if (i > 0) {
	                    result.deleteCharAt(result.length() - 1); // Remove the last character
	                }
	            } else {
	                result.append(currentChar);
	            }
	        }
	        
	        return result.toString();
	    }
	    
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        
	        System.out.print("Enter the sentence: ");
	        String inputSentence = scanner.nextLine();
	        
	        System.out.print("Enter the delete character: ");
	        char deleteChar = scanner.next().charAt(0);
	        
	        String output = removeCharactersBeforeDeleteChar(inputSentence, deleteChar);
	        System.out.println("Output: " + output);
	        
	        scanner.close();
	    }
	}


