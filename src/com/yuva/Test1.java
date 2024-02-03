package com.yuva;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class Test1 {
	public static void main(String[] args) throws NumberFormatException, IOException {
//		int x = 3;
//		System.out.println(++x*8);
//		byte x =64;
//		int i;
//		byte y;
//		i= x <<2;
//		y=(byte)(x << 2);
//		System.out.println(i+" "+y);
//	     Scanner scanner = new Scanner(System.in);
//
//	        // Input the number of houses (A) and localities (B)
//	        System.out.print("Enter the number of houses (A): ");
//	        int A = scanner.nextInt();
//	        System.out.print("Enter the number of localities (B): ");
//	        int B = scanner.nextInt();
//
//	        // Calculate the minimum and maximum number of telephone connections
//	        int minConnections = A * (A - 1) / 2; // Minimum connections when all houses are in one locality
//	        int maxConnections = A * (A - 1) / 2; // Maximum connections when all houses are in one locality
//
//	        // Output the results
//	        System.out.println("Minimum number of telephone connections: " + minConnections);
//	        System.out.println("Maximum number of telephone connections: " + maxConnections);
		      
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		        PrintWriter wr = new PrintWriter(System.out);

		        int A = Integer.parseInt(br.readLine().trim());
		        int B = Integer.parseInt(br.readLine().trim());

		        long[] out = MinMax(A, B);

		        for (int i_out_ = 0; i_out_ < out.length; i_out_++) {
		            if (i_out_ > 0) {
		                System.out.print(" ");
		            }
		            System.out.print(out[i_out_]);
		        }

		        wr.close();
		        br.close();
		    }

		    static long[] MinMax(int A, int B) {
		        long[] result = new long[2];
		        result[0] = (long) (A - (B - 1)) * (A - (B - 1) - 1) / 2; // Minimum number of connections
		        result[1] = (long) (A - (B - 1)) * (A - (B - 1) - 1) / 2; // Maximum number of connections
		        return result;		
	}

}
