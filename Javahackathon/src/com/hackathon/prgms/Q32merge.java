package com.hackathon.prgms;



public class Q32merge {
	
	public static int[] merge(int arr1[],int arr2[])
			{
		       int len1=arr1.length;
		       int len2=arr2.length;
		       int[] result=new int[len1+len2];
		       int i=0;
		       int j=0;
		       int k=0;
		       while(i < len1 && j < len2)
		       {
		    	   if(arr1[i] < arr2[j])
		    	   {
		    	   result[k]=arr1[i];
		    	   k++;
		    	   i++;
		    	   }
		    	   else
		    	   {  
		    		  result[k]=arr2[j];
		    		   k++;
		    	       j++;
		    	   }
		    	  	    	   
		       }
		       while(i <len1)
		       {
		    	   result[k]=arr1[i];
		    	   k++;
		    	   i++;
		       }
		       while(j < len2)
		       {
		    	   result[k]=arr2[j];
		    	   k++;
		    	   j++;
		       }
		       return result;
			
			}

	public static void main(String[] args) 
	{
		
		int array1[]={1,2,4,6,9,10};
		int array2[]= {3,5,7,8};
         int[] result=merge(array1,array2); 
          System.out.println("Sorted array is :");
         for(int i=0;i<result.length;i++)
         {
        	 System.out.println(result[i]);
         }
	}

}
