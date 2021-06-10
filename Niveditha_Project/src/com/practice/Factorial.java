package com.practice;

import java.util.Scanner;

// Factorial of a number is n!= n*(n-1)*(n-2)*(n-3)

// example : Factorial of 5!= 5*4*3*2*1

public class Factorial 
{
   public static void main(String[]args)
   {
	   
	   Scanner sc= new Scanner(System.in);
	   System.out.println("Please enter the number ");
	   int n= sc.nextInt();
	   int Factorial =1;
	   for(int i=1;i<=n;i++)
	   {
		   Factorial=Factorial*i;
		   
	   }
	   
	   System.out.println(Factorial);
	   
	   
   }
	
	  
}
