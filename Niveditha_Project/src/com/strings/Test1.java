package com.strings;

// Programm to test how many characters are there in a given String .



public class Test1 
{
    
	public static void main(String[]args)
	{
		String s1= "niveditha"; 
		int count=0;
		for(int i=0;i<s1.length();i++)
		{
			if(s1.charAt(i)!=' ')
			{
				count++;
			}
		}
		System.out.println(count);
		
	
	}
}	
