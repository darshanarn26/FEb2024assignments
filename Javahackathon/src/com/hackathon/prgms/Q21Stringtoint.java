package com.hackathon.prgms;

import java.util.Scanner;
//WJP to convert string to int
public class Q21Stringtoint {

	//convert string to int using parseInt method
	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter a string : ");
		String str=scan.nextLine();
	    int num=Integer.parseInt(str);
	    System.out.println("Converted string to int value is : " + num);
	    scan.close();

	}

}
