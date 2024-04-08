package com.hackathon.prgms;

public class Q13reversestr {
//Given a string print the reverse of the string
	
	public static void main(String[] args) 
	{
		String str="Java Code";
		System.out.println("Given string is : " + str);
		char[] chArr=str.toCharArray();
		System.out.print("Reversed String is : ");
		for(int i=str.length()-1;i>=0;i--)
		{
			System.out.print(chArr[i]);
		}

	}

}
