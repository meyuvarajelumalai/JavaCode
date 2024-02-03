package com.yuva;

import java.util.Scanner;

public class new_demo {
public static void main(String[] args) {
	
	 Scanner sc = new Scanner(System.in);
		 
     System.out.println("Enter the number: ");  
     String reverse = ""; 
     String num = sc.nextLine(); 
     int length = num.length();   
    for ( int i = length - 1; i >= 0; i-- )  
       reverse = reverse + num.charAt(i);  
    if (num.equals(reverse))  
       System.out.println("" +num +"YES");  
    else  
       System.out.println("" +num +"NO");     
	
		    	
		    }
}
//		        String[] inputData = {"Book", "Pen", "Brush", "Apple", "Bag", "Umbrella", "Soccer", "Laptop"};
//		        String[] keys = {"ba", "b", "", "x"};
//
//		        for (String key : keys) {
//		            String[] sortedArray = searchAndSort(inputData, key);
//		            System.out.println("Key: \"" + key + "\"");
//		            if (sortedArray.length == 0) {
//		                System.out.println("The key '" + key + "' doesn't exist in the data");
//		            } else {
//		                System.out.println("List: " + Arrays.toString(sortedArray));
//		            }
//		            System.out.println();
//		        }
//		    }
//
//		    public static String[] searchAndSort(String[] inputData, String key) {
//		        if (key.equals("")) {
//		            // If the key is an empty string, return the sorted array of all elements
//		            String[] sortedArray = Arrays.copyOf(inputData, inputData.length);
//		            Arrays.sort(sortedArray);
//		            return sortedArray;
//		        } else {
//		            // If the key is not empty, search for matching elements and return the sorted array
//		            String[] matchingElements = new String[inputData.length];
//		            int count = 0;
//		            for (String element : inputData) {
//		                if (element.toLowerCase().contains(key.toLowerCase())) {
//		                    matchingElements[count] = element;
//		                    count++;
//		                }
//		            }
//		            if (count == 0) {
//		                return new String[0]; // No matching elements found
//		            } else {
//		                String[] sortedArray = Arrays.copyOf(matchingElements, count);
//		                Arrays.sort(sortedArray);
//		                return sortedArray;
//		            }
//		        }
//		    }
//		}
//		    	int r, sum = 0, temp;
//				int n = 999;// It is the number variable to be checked for palindrome
//		
//				temp = n;
//				while (n > 0) {
//					r = n % 10; // getting remainder
//					sum = (sum * 10) + r;
//					n = n / 10;
//				}
//				if (temp == sum)
//					System.out.println("NO");
//				else
//					System.out.println("YES");
//			}
//		}
		    	
		    	
		    	