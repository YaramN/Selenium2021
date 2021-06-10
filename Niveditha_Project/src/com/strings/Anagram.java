package com.strings;

import java.util.Arrays;

// Anagram means 2 strings contains same characters but no need to be in same order 

// check if length  of both the strings is equal or not , convert strings to lower case letters 

// by using sorting check the strings are equal or not 




public class Anagram {

	public static void main(String[] args)
	{
		String s1= "nivvi";
		String s2= "invivi";
		s1= s1.toLowerCase();
		s2=s2.toLowerCase();
		if(s1.length()==s2.length())
		{
			char string1[]=s1.toCharArray(); 
			char string2[]=s2.toCharArray();
			
			Arrays.sort(string1);
			Arrays.sort(string2);
			
			if(Arrays.equals(string1,string2)==true)
			{
				System.out.println("Both strings are anagram");
			}
		}
		
		else 
		{
			System.out.println("given strings are not anagram");
		}
	}

}
