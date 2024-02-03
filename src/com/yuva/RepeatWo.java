

package com.yuva;

import java.util.Iterator;

public class RepeatWo {
	
	public static void main(String[] args) {
		
		String y = " Yuvaraj";
		
		String r = " ";
		 for (int i=y.length()-1; i>0; i--) {
			 r=r+y.charAt(i);
			 
		 }
		 
		System.out.println("Reverse Name:"+r);
		
				
}
}
