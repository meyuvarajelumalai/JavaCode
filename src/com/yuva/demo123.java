package com.yuva;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class demo123 {

public static void main(String[] args) {
//	      List aList = new ArrayList<>();
//	      aList.add("12");
//	      aList.add("35");
//	      aList.add("1");
//	      aList.add("10");
//	      aList.add("34");
//	      aList.add("98");
//	      System.out.println(""+ aList.contains("34"));
//	   }
//	}

//		int r, sum = 0, temp;
//		int n = 123;// It is the number variable to be checked for palindrome
//
//		temp = n;
//		while (n > 0) {
//			r = n % 10; // getting remainder
//			sum = (sum * 10) + r;
//			n = n / 10;
//		}
//		if (temp == sum)
//			System.out.println("123 is Polindrom number Yes");
//		else
//			System.out.println("123 is Polindrom number No");
//	}
//}
		
//		int num, rev=0, rem, temp;
//	      Scanner scan = new Scanner(System.in);
//	      
//	      System.out.print("Enter a Number: ");
//	      num = scan.nextInt();
//	      
//	      temp = num;
//	      while(temp!=0)
//	      {
//	         rem = temp%10;
//	         rev = (rev*10) + rem;
//	         temp = temp/10;
//	      }
//	      
//	      if(num==rev)
//	         System.out.println("\nIt is a Palindrome Number.");
//	      else
//	         System.out.println("\nIt is not a Palindrome Number.");
//	   }
//	}		

//		static void reverse(int a[], int n)
//	    {
//	        int[] b = new int[n];
//	        int j = n;
//	        for (int i = 0; i < n; i++) {
//	            b[j - 1] = a[i];
//	            j = j - 1;
//	        }
//	  
//	        // printing the reversed array
//	        System.out.println("Reversed array is: \n");
//	        for (int k = 0; k < n; k++) {
//	            System.out.print(" "+b[k]);
//	        }
//	    }
//	  
//	    public static void main(String[] args)
//	    {
//	        int [] arr = {10, 20, 30, 40, 50};
//	        reverse(arr, arr.length);
//	    }
//	}		
	
	
//	String string1 = "aabbcc";  
//    int count;  
//      
//    //Converts given string into character array  
//    char string[] = string1.toCharArray();  
//      
//    //Counts each character present in the string  
//    for(int i = 0; i <string.length; i++) {  
//        count = 1;  
//        for(int j = i+1; j <string.length; j++) {  
//            if(string[i] == string[j] && string[i] != ' ') {  
//                count++;  
//                //Set string[j] to 0 to avoid printing visited character  
//                string[j] = '0';  
//            }  
//        }  
//        //A character is considered as duplicate if count is greater than 1  
//        if(count > 1 && string[i] != '0')  
//            System.out.print(" "+string[i]);  
//    }  
//}  public class SkipElementProgram {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Number of elements: ");
        int numElements = scanner.nextInt();

        ArrayList<String> elements = new ArrayList<>();
        System.out.print("Sample input: ");
        for (int i = 0; i < numElements; i++) {
            elements.add(scanner.next());
        }

        System.out.print("Sample input skip element: ");
        int skipIndex = scanner.nextInt();

        ArrayList<String> output = new ArrayList<>();
        for (int i = 0; i < numElements; i++) {
            if (i != skipIndex) {
                output.add(elements.get(i));
            }
        }

        System.out.println("Output: " + output);
    }
}
//}  
	
	