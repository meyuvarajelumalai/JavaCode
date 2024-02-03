package com.yuva;

public class StringRevers {
		
	private  void word() {
		String s = "Iam a Java Developer";
		String[] split = s.split("");
		for (int i = split.length-1; i>=0; i-- ) {
		System.out.print(split[i]);	
		}	
	System.out.println("");
	}
	
	private void charater() {
		String s1 = "Iam a Java Developer";
		String[] split1 = s1.split(" ");
		for (int i = split1.length-1; i>=0; i-- ) {
		System.out.print(split1[i]+" ");	
	}
	}
public static void main(String[] args) {
	StringRevers r = new StringRevers();
	r.word();
    r.charater();
}
}
