package com.yuva;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class StreamApi {
	
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(1,10,20,30,15,50);
		/*
		 * Optional<Integer> sum =list.stream().reduce((a,b) -> a+b);
		 * System.out.println("Sum Of numbers:" + sum.get());
		 */		
//		double avg=list.stream().mapToInt(e -> e).average().getAsDouble();
//		System.out.println("Avg is :" + avg);
//		double avg = list.stream().map(e -> e*e).filter(e -> e > 100)
//				.mapToInt(e -> e).average().getAsDouble();
//		System.out.println(avg);
		
		  int min = list.stream().min(Comparator.comparing(Integer::valueOf)).get();
		  System.out.println(min);
		 
		  int max = list.stream().max(Comparator.comparing(Integer::valueOf)).get();
		  System.out.println(max);
		 		
	}
	}



