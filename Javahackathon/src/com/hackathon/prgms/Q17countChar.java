package com.hackathon.prgms;
//WJP to find total number of integers, uppercase and lowercase character in the give string
import java.util.Scanner;

public class Q17countChar {

	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter a string : " );
		String str=scan.nextLine();
		int numbers=0;
		int uppercase=0;
		int lowercase=0;
		
		for(int i=0;i< str.length();i++)
		{
			char ch =str.charAt(i);
			if(Character.isUpperCase(ch))
			{
				uppercase++;
			}
			else if(Character.isLowerCase(ch))
			{
				lowercase++;
			}
			else if(Character.isDigit(ch))
				numbers++;
		
		}
		System.out.println("Number of uppercase letters : " + uppercase);
		System.out.println("Number of lowercase letters :" +lowercase);
		System.out.println("Number of integers : " + numbers);
		scan.close();

	}

}
