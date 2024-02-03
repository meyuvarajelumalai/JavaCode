package com.yuva;

public class publicisAssessment {

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
	        String input1 = "thisisthe###sentence###";
	        char char1 = '#';
	        String output1 = removeCharactersBeforeDeleteChar(input1, char1);
	        System.out.println("Sample output 1: " + output1);
	        
	        String input2 = "thi@@@s@howar@@e";
	        char char2 = '@';
	        String output2 = removeCharactersBeforeDeleteChar(input2, char2);
	        System.out.println("Sample output 2: " + output2);
	    }
	}



