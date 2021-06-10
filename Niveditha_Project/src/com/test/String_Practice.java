package com.test;

public class String_Practice 
{
	
	public static void main(String[]args)
	{
		String s1="aba";
		int noOfChar = 10;
		
		int count = 0;
		int totalsize = s1.length()-1;
		for(int index =0;index<=totalsize;index++)
		{
			if(s1.charAt(index) == 'a')
				count++;
		}
		
		int NoOfitr = noOfChar / (totalsize+1);
		int count1 = NoOfitr*count;
		
//		int strIndex=0;
//		int count =0;
//		int totalsize = s1.length()-1;
//		
//		for(int index =0;index <noOfChar;index++)
//		{
//			if(s1.charAt(strIndex) == 'a')
//				count++;
//			
//			if(strIndex == totalsize)
//			{
//				strIndex=0;
//				continue;
//			}
//				
//			
//			
//			strIndex++;
//		}
//		
		System.out.println(count1);
		
	}
}
