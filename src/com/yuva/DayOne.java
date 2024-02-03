package com.yuva;

public class DayOne {
	    // Method to encode a word using a Caesar Cipher
	    public static String encode(String word, int shift) {
	        StringBuilder encodedWord = new StringBuilder();

	        for (char character : word.toCharArray()) {
	            if (Character.isLetter(character)) {
	                char base = Character.isLowerCase(character) ? 'a' : 'A';
	                encodedWord.append((char) ((character - base + shift) % 26 + base));
	            } else {
	                encodedWord.append(character);
	            }
	        }

	        return encodedWord.toString();
	    }

	    // Method to decode a word using a Caesar Cipher
	    public static String decode(String encodedWord, int shift) {
	        return encode(encodedWord, 26 - shift); // Decoding is essentially encoding with the reverse shift
	    }

	    public static void main(String[] args) {
	        String originalWord = "HelloWorld";
	        int shift = 3;

	        String encodedWord = encode(originalWord, shift);
	        System.out.println("Encoded: " + encodedWord);

	        String decodedWord = decode(encodedWord, shift);
	        System.out.println("Decoded: " + decodedWord);
	    }
	
	
	
}
