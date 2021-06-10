package com.strings;

import java.util.Scanner;

//  String which is same from as forward and backward  , then that string is known as Palindrome 

//  Ezamples : MOM , kayak

public class Palindrome {

	public static void main(String[] args) 
	{
		Scanner Sc= new Scanner(System.in);
		System.out.println("Enter the string ");
		String  str= Sc.next();
		String rev="";
		int len= str.length();
		
		// using while loop 
		
		while(len>0)
		
		{ 
			int i =len-1;
			rev=rev+str.charAt(i);
			len--;
		}
		
		//using for loop 
		
		for(int i=len-1;i>=0;i--)
		{
			rev= rev+str.charAt(i);
			
		}
		
		//System.out.println(rev);
		
        if(str.equals(rev))
        {
        	System.out.println("Palindrome");
        }
        else
        {
        	System.out.println("not a palindrome");
        }
	}

}
