package com.hackathon.prgms;

//Given a string print the unique words of the string
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;


public class Q15uniquewords {

	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter a string : ");
		String str=scan.nextLine();
		HashMap<String, Integer> map=new HashMap<String, Integer>();
		String[] uni_words=str.split("\\W");
		for(String word : uni_words)
		{
			if(map.containsKey(word)) 
			{
				map.put(word, map.get(word)+1);
			}
			else
			{
				map.put(word, 1);
			}
		}
		System.out.println("Unique words are :");
		for(Map.Entry<String, Integer> hm : map.entrySet())
		{
			if(hm.getValue()==1)
			{
				System.out.println( hm.getKey());
			}
			
		}
		scan.close();
		

	}

}
