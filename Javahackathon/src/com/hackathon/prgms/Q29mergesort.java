package com.hackathon.prgms;

import java.util.Scanner;

public class Q29mergesort {

	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter size of the array : ");
		int size=scan.nextInt();
		System.out.println("Enter array elements : ");
		int[] arr=new int[size];
		for(int i=0;i<size;i++)
		{
			arr[i]=scan.nextInt();
		}
           scan.close();
		 mergeSort(arr,0,arr.length-1);
		 System.out.print("Sorted elements :");
		 for(int e : arr)
		 {
			 System.out.print(e+" ");
		 }
	}

	private static void mergeSort(int[] arr, int i, int j) 
	{
		if(i<j)
		{
			int mid=(i+j)/2;
			mergeSort(arr,i,mid);
			mergeSort(arr,mid+1,j);
			merge(arr,i,mid,j);
		}
		
	}

	private static void merge(int[] arr, int low, int mid, int high) 
	{
		int i=low;
		int j=mid+1;
		int k=low;
		int[] b=new int[arr.length];
		while(i<=mid && j<=high)
		{
			if(arr[i]<arr[j])
			{
				b[k]=arr[i];
				i++;
				k++;
			}
			else
			{
				b[k]=arr[j];
				j++;
				k++;
			}
		}
		while(i<=mid)
		{
			b[k]=arr[i];
			i++;
			k++;
		}
		while(j<=high)
		{
			b[k]=arr[j];
			j++;
			k++;
		}
		for(i=low;i<=high;i++)
		{
			arr[i]=b[i];
		}
		
	}

}
