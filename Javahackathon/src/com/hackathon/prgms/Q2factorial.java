package com.hackathon.prgms;

import java.util.Scanner;

public class Q2factorial {
	
	public static int findFactorial(int number)
	{
		if(number<0)
		{
			throw new RuntimeException("Invalid entry");
		}
		int factorial=1;
		for(int i=number;i>=1;i--)
		{
			factorial=factorial*i;
		}
		return factorial;

		
	}
	public static void main(String[] args) 
	{
		try
		{
		Scanner fact=new Scanner(System.in);
		System.out.println("Enter a number");
		int num=fact.nextInt();
		int factorialnum=findFactorial(num);
		System.out.println("Factorial of the given number is : " + factorialnum);
		fact.close();
		}
		catch(Exception e)
		{
			System.out.println("Enter valid number");
			e.printStackTrace();
		}

	}

}
