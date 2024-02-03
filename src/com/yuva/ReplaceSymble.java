package com.yuva;

public class ReplaceSymble {
	public static void main(String[] args) {
		String s = "j a v a j a v a";
		char charToReplace = 'a';
		String symbol = "$";
		String result = "";
		int symbolCount = 1;
		for (char c : s.toCharArray()) {
			if (c == charToReplace) {
				result += symbol.repeat(symbolCount);
				symbolCount++;
			} else {
				result += c;
			}
		}
		System.out.println(result);
	}
}

