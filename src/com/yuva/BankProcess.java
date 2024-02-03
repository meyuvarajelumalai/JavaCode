package com.yuva;

import java.util.Scanner;

public class BankProcess {
public static void main(String[] args) {
	  int balance = 10000, withdraw, deposit;  
      
      //create scanner class object to get choice of user  
      Scanner sc = new Scanner(System.in);  
        
      while(true)  
      {  
          System.out.println("உங்கள் விருப்பத்தை தேர்வு செய்யவும்"); 
          System.out.println("பணம்எடுத்தல் 1");  
          System.out.println("பணம்போடுதல் 2");  
          System.out.println("இருப்பு_விசாரணை 3");  
          System.out.println("வெளியேறு 4");  
            
          //get choice from user  
          int choice = sc.nextInt();  
          switch(choice)  
          {  
              case 1:  
      System.out.print("தொகையை உள்ளிடவும்:");  
                    
      //get the withdrawl money from user  
      withdraw = sc.nextInt();  
                    
      //check whether the balance is greater than or equal to the withdrawal amount  
      if(balance >= withdraw)  
      {  
          //remove the withdrawl amount from the total balance  
          balance = balance - withdraw;  
          System.out.println("தயவுசெய்து உங்கள் பணத்தை எடுத்துக் கொள்ளுங்கள்");  
      }  
      else  
      {  
          //show custom error message   
          System.out.println("போதிய இருப்பு இல்லை");  
      }  
      System.out.println("");  
      break;  
 
              case 2:  
                    
      System.out.print("டெபாசிட் செய்ய வேண்டிய பணத்தை உள்ளிடவும்:");  
                    
      //get deposite amount from te user  
      deposit = sc.nextInt();  
                    
      //add the deposit amount to the total balanace  
      balance = balance + deposit;  
      System.out.println("உங்கள் பணம் வெற்றிகரமாக டெபாசிட் செய்யப்பட்டது");  
      System.out.println("");  
      break;  
 
              case 3:  
      //displaying the total balance of the user  
      System.out.println("இருப்பு : "+balance);  
      System.out.println("");  
      break;  

              case 4:  
      //exit from the menu  
      System.exit(0);  
          }  
      }  
  }  
}  