package com.practice;

import java.util.Scanner;

// Amstrong Number: Sum of cubes of the number is equal to the number 
//  Example : 0, 1, 153, 370

public class Amstrong 
{
    public static void main(String[]args)
    {
    	
    	Scanner sc= new Scanner(System.in);
    	System.out.println("Enter the value of N");
    	int n=sc.nextInt();
    	int r=0; int ams=0;
    	for(int i=1;i<=n;i++)
    {
    	r=n%10;//5
    	 ams = ams+r*r*r;//27+125
    	 n=n/10;//1
    	 
     }
    
    System.out.println(ams);
    
	
	
}
}
