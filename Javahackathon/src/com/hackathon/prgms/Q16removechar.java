package com.hackathon.prgms;
//Write a method that will remove given character from the String
import java.util.Scanner;

public class Q16removechar {

	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter a string : ");
		String str=scan.nextLine();
		System.out.println("Enter a character to remove :");
		char ch=scan.next().charAt(0);
		String result;
		result=remove(str,ch);
		System.out.println("String after removing the given character : " + result);
		scan.close();

	}

	 private static String remove(String original,char remove)
	 {
		 char[] ch=original.toCharArray();
		 int index=0;
		 for(int i=0;i<ch.length;i++)
		 {
			 if(ch[i]!=remove)
			 {
				 ch[index++]=ch[i];
			 }
	 }
		 String res=new String(ch,0,index);
		 return res;
}
}


























/*Scanner scan=new Scanner(System.in);
System.out.println("Enter a string : ");
String str=scan.next();
String normalstr=str.replaceAll("[^a-zA-z0-9]", "");
System.out.println("normal string is : " + normalstr);
scan.close();*/