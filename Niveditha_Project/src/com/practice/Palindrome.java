package com.practice;

import java.util.Scanner;

// Palindrome means if the reverse of the number  is equals to given number then that number is said to be a Palindrome number

// Compare number and reverse of a number 

public class Palindrome 
{

	 public static void main(String[]args)
	 {
		 Scanner Sc= new Scanner(System.in);
		 System.out.println("Enter the value of n ");
		 int n= Sc.nextInt();
		 int rev;
		 int r;
		 int temp =n;
		 for(rev=0;n>0;n/=10)
		 { 
		 r=n%10;
		 rev=(rev*10)+r;
		 n=n/10;
			 
		 }
		
		 
		 if(rev==temp)
		 {
			 System.out.println("Given number is a Plaindrome Number");
		 }
		 else
		 {
			 System.out.println("Given number is not a palindrome Number");
		 }
		 
		 
		 
		 
		 
	 }
}
