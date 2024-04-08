package com.hackathon.prgms;
//WJP to display duplicate character in string
import java.util.Scanner;

public class Q18duplicates {

	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter a string : ");
		String str=scan.nextLine();
		char[] chArr=str.toCharArray();
		
		System.out.print("Duplicate elements are :");
		for(int i=0;i<chArr.length;i++)
		{
			for(int j=i+1;j<chArr.length;j++)
			{
				if(chArr[i]==chArr[j])
				{
					System.out.println(chArr[j]);
				}
				
				
			}
		}
		scan.close();
		

	}

}
