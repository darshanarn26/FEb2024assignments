package com.hackathon.prgms;

import java.util.Scanner;

public class Q23input {
	//program to find entered value is string or int

	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter a value : ");
		String value=scan.next();
		
		try
		{
		int num=Integer.parseInt(value);
		System.out.println("Input is an integer " + num);
			
		}
		catch(NumberFormatException e)
		{
			System.out.println("Input is a string");
		}
		
		scan.close();
		
		

	}

}
