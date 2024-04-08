package com.hackathon.prgms;
//Write a function to find out longest palindrome in a given string?
import java.util.Scanner;

public class Q30Longestpalindrome {

	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter a string : ");
		String str=scan.nextLine();
		System.out.println("Palindromic string is ");
		System.out.println(getLongest(str));
		scan.close();

	}
    public static String getLongest(String inputstr)
    {
    	if(inputstr.isEmpty())
    		return "Enter valid string";
    	
    	if(inputstr.length()==1)
    	   return inputstr;
		
		
		String longest=inputstr.substring(0, 1);
		for(int i=0;i<inputstr.length();i++)
		{
		String temp=checkequal(inputstr,i,i);
		if(longest.length() < temp.length())
		{
			longest=temp;
		}
		temp=checkequal(inputstr,i,i+1);
		if(longest.length() < temp.length())
		{
			longest=temp;
		}
		 
			
		}
		return longest;	
	
    }
    public static String checkequal(String inputstring, int begin, int end)
    {
    	while(begin >=0 && end<=inputstring.length()-1 && inputstring.charAt(begin)== inputstring.charAt(end))
    	{
    		begin--;
    		end++;
    	}
    	
    	return inputstring.substring(begin+1, end);
    }
}
