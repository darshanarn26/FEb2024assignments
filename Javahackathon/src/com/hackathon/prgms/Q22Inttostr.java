package com.hackathon.prgms;

import java.util.Scanner;

public class Q22Inttostr {
	//converting integer to string using tostring()

	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter a number : ");
		int num=scan.nextInt();
        String str=Integer.toString(num);
        System.out.println("Converted integr to string using tostring : " + str);
        scan.close();
	}

}
