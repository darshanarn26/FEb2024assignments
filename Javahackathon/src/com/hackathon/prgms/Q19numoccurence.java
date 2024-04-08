package com.hackathon.prgms;
//WJP to display number of occurrence of all character
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Q19numoccurence {

	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter a string : ");
		String str=scan.nextLine();
		char[] ch=str.toCharArray();
		Map<Character, Integer> map=new HashMap<Character, Integer>();
		for(char c :ch)
		{
			if(map.containsKey(c))
			{
				map.put(c, map.get(c)+1);
			}
			else
			{
				map.put(c, 1);
			}
		}
		System.out.println("Given string is : " +str); 
		System.out.println("Occurence is : "+map);
		
		scan.close();
	}

}
