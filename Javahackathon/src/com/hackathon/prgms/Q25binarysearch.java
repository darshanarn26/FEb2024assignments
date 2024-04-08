package com.hackathon.prgms;

import java.util.Scanner;
//Write a program for binary search. And 5 i/p has to take from user as binary elements.
public class Q25binarysearch {

	public static void main(String[] args) 
	{

         Scanner scan=new Scanner(System.in);
         boolean b=false;
         System.out.println("Enter size of the array : ");
         int size=scan.nextInt();
         System.out.println("Enter sorted numbers : ");
         int[] num=new int[size];
         
         for(int i=0;i<size;i++)
         {
        	 num[i]=scan.nextInt();
         }
         
         System.out.println("Enter target element : ");
         int target=scan.nextInt();
         
         int lower=0;
         int higher=num.length-1;
         while(lower<=higher)
         {
        	 int mid=(lower+higher)/2;
        	 
        	 if(num[mid]==target)
        	 {
        		 System.out.println("Element found : ");
        		 b=true;
        		 break;
        	 }
        	 if(num[mid]<target)
        	 {
        		 lower=mid+1;
        	 }
        	 if(num[mid]>target)
        	 {
        		 higher=mid-1;
        	 }
         }
         if(b==false)
         {
        	 System.out.println("Element not found :");
         }
         scan.close();
         

	}

}
