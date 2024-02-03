package com.yuva;
public class ArrayDoWhile {
public static void main(String[] args) {
int i []= new int [10];
i[0]=9;
i[1]=9;
i[2]=6;
i[3]=2;
i[4]=6;
i[5]=6;
i[6]=6;
i[7]=6;
i[8]=3;
i[9]=7;
int j = 0;{
do {
System.out.println(i[j]);
j++;
}
while (j<i.length);
}
}
}
