package com.hackathon.prgms;

import java.util.Arrays;
import java.util.Scanner;

public class Q3sortarray {

	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the size of the array");
		int n=scan.nextInt();
		System.out.println("Enter the numbers :");
		
		int[] numbers=new int[n];
		for(int i=0;i<n;i++)
		{
			numbers[i]=scan.nextInt();
		}
		
		System.out.println("original array is : ");
		for(int i=0;i<n;i++)
		{
			System.out.print(numbers[i]+" ");
		}
	  
		System.out.println();
		sortArray(numbers);
		System.out.println("Sorted array is : ");
		System.out.println(Arrays.toString(numbers));
		
		
		scan.close();
		
	}
        public static void sortArray(int[] array)
        {
		
		 int temp=0;
		 for(int i=0;i<array.length;i++)
		 {
			 for(int j=i+1;j<array.length;j++)
			 {
				 if(array[j]<array[i])
				 {
					 temp=array[i];
					 array[i]=array[j];
					 array[j]=temp;
				 }
			 }
			 
		 }
		 
        }
	}

