package com.hackathon.prgms;

import java.util.Scanner;

public class Q4palindromeint {
	
	 
	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter size of the array :");
		int size=scan.nextInt();
		System.out.println("Enter numbers :");
		int[] num=new int[size];
		
		for(int i=0;i<size;i++)
		{
			num[i]=scan.nextInt();
		}
		 scan.close();
		 int i,j;
		 for(i=0,j=size-1;i<=j;i++,j--)
		 {
		 	if(num[i]!=num[j])
		 	{
		 		System.out.println("Array is not palindrome");
		 		break;
		 	}
		 }
		 if(i>j)
		 {
		 	System.out.println("Array is palindrome");
		 }


         
	}
	

}

























