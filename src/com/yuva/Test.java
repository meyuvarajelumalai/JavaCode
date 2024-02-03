package com.yuva;
import java.util.stream.IntStream;

public class Test {
	    public static void main(String[] args) {
	        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

	        IntStream.of(numbers)
	            .boxed()
	            .sorted((a, b) -> a % 2 == b % 2 ? a - b : a % 2 == 0 ? -1 : 1)
	            .forEach(System.out::print);
	    }
	}
