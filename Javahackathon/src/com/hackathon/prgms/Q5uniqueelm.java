package com.hackathon.prgms;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

//Given an array prints the unique numbers and also print the number of occurrences of duplicate numbers.
public class Q5uniqueelm {
	
		public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter size of the array : ");
		int size=scan.nextInt();
		System.out.println("Enter numbers : ");
		int[] num=new int[size];
			
		for(int i=0;i<size;i++)
		{
			num[i]=scan.nextInt();
			
		}
		
		scan.close();
		//sorting
		Set<Integer> set=new HashSet<Integer>();
		for(int s : num)
		{
			set.add(s);
		}
		System.out.println("Sorted elements are : ");
		for(int sort : set)
		{
			System.out.println(sort + " ");
		}
		// count of occurences of elements
		
		HashMap<Integer, Integer> hm=new HashMap<Integer, Integer>();
		for(int i=0;i<num.length;i++)
		{
			if(hm.containsKey(num[i]))
			{
				hm.put(num[i], hm.get(num[i])+1);
			}
			else
			{
				hm.put(num[i], 1);
			}
		}
	for(Map.Entry<Integer, Integer> m :hm.entrySet())
	{
		System.out.println("Element      frequency : " );
		System.out.println(m.getKey()+ "       " +m.getValue());
	}
	
		
	}

}











/*Arrays.sort(num);
scan.close();
for(int i=0;i<size-1;i++)
{
	if(num[i]!=num[i+1])
	{
		System.out.print(num[i]+ " ");
	}
}
System.out.println(num[num.length-1]);
 
*/