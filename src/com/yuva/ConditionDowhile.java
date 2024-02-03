package com.yuva;

public class ConditionDowhile {
public static void main(String[] args) {
int i = 10;	
do {
System.out.println(i);		
i--;
if (i == 5)
break;
} while (i <= 10);
}
}
