package com.hackathon.prgms;

import java.util.Scanner;


public class Q1booleantwo {
	
	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter first boolean value");
		boolean first=scan.nextBoolean();
		System.out.println("Enter second boolean value");
		boolean second=scan.nextBoolean();
		System.out.println("Enter third boolean value");
		boolean third=scan.nextBoolean();
		
		if(first && (second||third) || (second&&third))
		{
			System.out.println("Aleast two given booleans are true");
		}
		else
		{
			System.out.println("No two booleans are true");
		}
		scan.close();
	}
}
