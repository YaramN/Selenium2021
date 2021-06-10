package com.strings;

// Need to test number of vowels and consonants in a given sequence of Strings 

public class Test2
{
   public static void main(String[]args)
   
   {
	    String s1= "I will get a job";
	    String s2=s1.toLowerCase();
	    System.out.println(s2);
	   int  Ccount=0;int Vcount=0;
	   for(int i=0;i<s2.length();i++)
	   {
		   if(s2.charAt(i)=='a'||s2.charAt(i)=='e'||s2.charAt(i)=='i'||s2.charAt(i)=='o'||s2.charAt(i)=='u')
           Vcount++;
           else if(s2.charAt(i)>='a'&&s2.charAt(i)<='z')
           
        	   Ccount++;
	   }
	   System.out.println(Vcount);
	   System.out.println(Ccount);
	    
   }
	
	
	
}
