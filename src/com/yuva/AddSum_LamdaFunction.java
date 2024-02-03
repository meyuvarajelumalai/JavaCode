package com.yuva;

import java.util.Arrays;
import java.util.List;

public class AddSum_LamdaFunction {
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(1,5,6,7,8,3);
		double avg = list.stream().mapToInt(e -> e).average().getAsDouble();
		System.out.println("Avg Is :" + avg );
	}
}
