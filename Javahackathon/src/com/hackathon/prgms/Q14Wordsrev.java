package com.hackathon.prgms;


//Given a string print the reverse of the words string.
public class Q14Wordsrev {

	public static void main(String[] args) 
	{
		String str="Java code";
		String[] rev_str=str.split(" ");
		System.out.print("Given String is : ");
		for(int i=0;i<rev_str.length;i++)
		{
			System.out.print(rev_str[i] + " ");
		}
		System.out.println();
		System.out.print("Reversed String is :");
		for(int i=rev_str.length-1;i>=0;i--)
		{
			System.out.print(rev_str[i] + " ");
		}
		
	}

}
