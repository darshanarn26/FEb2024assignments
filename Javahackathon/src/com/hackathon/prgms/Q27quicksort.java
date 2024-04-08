package com.hackathon.prgms;

import java.util.Scanner;

public class Q27quicksort {
	
	private static void quickSort(int[] arr ,int low,int high)
	{
		int mid=(low+high)/2;
		int i=low;
		int j=high;
		int pivot=arr[mid];
		
		while(i<=j)
		{
			while(arr[i]<pivot)
			{
				i++;
			}
			while(arr[j]>pivot)
			{
				j--;
			}
			if(i<=j)
			{
				int temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
				i++;
				j--;
				
			}
			
		}
		if(low<j)
			quickSort(arr,low,j);
		if(high>i)
			quickSort(arr,i,high);
		
	}

	public static void main(String[] args) 
	{
     
	  Scanner scan=new Scanner(System.in);
	  System.out.println("Enter the size of the array :");
	  int size=scan.nextInt();
	  System.out.println("Enter the numbers : ");
	  int[] numbers=new int[size];
	  for(int i=0;i<size;i++)
	  {
		  numbers[i]=scan.nextInt();
	  }
	  
	  System.out.println("Before sorting : "+ " ");
	  for(int i=0;i<numbers.length;i++)
	  {
		  System.out.print(numbers[i]+" ");
	  }
	  System.out.println();
	  quickSort(numbers,0,numbers.length-1);
	  System.out.println("After sorting : " + " ");
	  for(int i=0;i<numbers.length;i++)
	  {
		  System.out.print(numbers[i]+" ");
	  }
      scan.close();
	}

}
