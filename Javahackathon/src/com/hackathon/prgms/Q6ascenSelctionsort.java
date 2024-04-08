package com.hackathon.prgms;

import java.util.Scanner;
//WJP to perform ascending order Selection  sort
public class Q6ascenSelctionsort {

	public static void main(String[] args) 
	{

          Scanner scan=new Scanner(System.in);
          System.out.println("Enter size of array : ");
          int size=scan.nextInt();
          System.out.println("Enter numbers : ");
          int[] num=new int[size];
          
          for(int i=0;i<size;i++)
          {
        	  num[i]=scan.nextInt();
          }
          scan.close();
         
          // using selection sort
          
          
          for(int i=0;i<num.length-1;i++)
          {
        	  int min_index=i;
        	  for(int j=i+1;j<num.length;j++)
        	  {
        		  if(num[min_index] > num[j])
        		  {
        			  min_index=j;
        		  }
        	  }
        	  
        	  int temp=num[min_index];
        	  num[min_index]=num[i];
        	  num[i]=temp;
          }
         
          System.out.println("Sorted array is :");
          
          for(int i=0;i<num.length;i++)
          {
          
        	  System.out.print(num[i] + " ");
         
          }
	}

}
