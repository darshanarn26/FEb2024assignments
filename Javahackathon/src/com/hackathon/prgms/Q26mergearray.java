package com.hackathon.prgms;

import java.util.Arrays;
import java.util.Scanner;

public class Q26mergearray {

	public static void main(String[] args) 
	{
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter size of array1 : ");
		int size1=scan.nextInt();
		System.out.println("Enter size of array2 : ");
		int size2=scan.nextInt();
		int[] array1=new int[size1+size2];
		int[] array2=new int[size2];
		System.out.println("Enter elements for array1 : ");
		for(int i=0;i<size1;i++)
		{
			array1[i]=scan.nextInt();
		}
		
		System.out.println("Enter elements for second array : ");
		for(int i=0;i<size2;i++)
		{
			array2[i]=scan.nextInt();
		}
		merge(array1,size1,array2,size2);
		scan.close();
	}
	
	private static void merge(int[] arr1 ,int size1,int[] arr2 ,int size2)
	{
		int j=0;
		for(int i=0;i<=(size1+size2-1);i++)
		{
			arr1[i]=arr2[j];  // adding elements of arr2 to arr1
			j++;
		}
		Arrays.sort(arr1);
		System.out.println("Sorted elements are : "+ Arrays.toString(arr1));
	}

}
