package com.practice;

import java.util.Scanner;

// The current value is equal to addition of previous 2 values 
// example if fibnocci series : 0 ,1 , 1 , 2, 3, 5, 8....

public class Fibnocci 
{
   
	public static void main(String[]args)
	{
		
		Scanner Sc= new Scanner(System.in);
		System.out.println("Please enter the value of N");
		int n=Sc.nextInt();
		int n1=0;
		int n2=1;
		System.out.print(n1+ " "+n2);
		int temp=0;
		for(int i=1;i<=n;i++)
		{
			temp=n1+n2;
			n1=n2;
			n2=temp;
			System.out.print(" "+temp);
			
		}
		
		
		
		
		
	}
}
