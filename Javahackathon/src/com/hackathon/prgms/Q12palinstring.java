package com.hackathon.prgms;

import java.util.Scanner;
// Write a program to check palindrome (MalayalaM) for both numbers and string?
public class Q12palinstring {

	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter a string :");
		String str=scan.nextLine();
		String reverse="";
		
		for(int i=str.length()-1;i>=0;i--)
		{
			reverse=reverse+str.charAt(i);
		}
	
		
		if(str.equalsIgnoreCase(reverse))
		{
			System.out.println("String is palindrome");
		}
		else
		{
			System.out.println("String is not palindrome");
		}
		
		
		/*System.out.println("Enter a number");
		int num =scan.nextInt();
		int org_num=num;
		int rev=0;
		while(num!=0)
		{
			rev=rev*10+num%10;
			num=num/10;
		}
		if(org_num==rev)
		{
			System.out.println("Given number is palindrome");
			
		}
		else
		{
			System.out.println("Given number is not palindrome");
		}*/
	   scan.close();
	} 
	

}
