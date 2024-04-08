package com.hackathon.prgms;

import java.util.Scanner;

public class Q28factorial {
	
	public static int fact(int num)
	{
		if(num==0)
		{
			return 1;
		}
		else
		{
			return num*fact(num-1);
		}
	}

	public static void main(String[] args) 
	{
		Scanner scan =new Scanner(System.in);
		System.out.println("Enter a number : ");
		int value=scan.nextInt();
		System.out.println("Factorial of the given number is : " + fact(value));
        scan.close();
	}

}
