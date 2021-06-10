package com.practice;

import java.util.Scanner;

// A number which is divisible by one and itself then that number is said to be a prime number 

// it will have only 2 factors 1 and itself 

// Prime number starts from 2 

public class PrimeNumber 
{
	public static void main(String[]args)
	{
		Scanner Sc= new Scanner(System.in);
		System.out.println("Please enter the value of N");
		int n = Sc.nextInt();
		int count=0;
		
		if(n==0 || n==1)
		{
			System.out.println("Given number is not a Prime number ");
			
		}
		
		else
		{
		   for(int i=1;i<=n;i++)
		   {  
			   if(n%i==0)
			   count++;
			   
		   }
		   if(count==2)
		   {
			   System.out.println("Given number N prime number");
		   }
		   else
		   {
			   System.out.println("Given number is not a prime number ");
		   }
		   
		}
		
		
		
	}

}
