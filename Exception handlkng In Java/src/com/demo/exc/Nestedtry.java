package com.demo.exc;

public class Nestedtry {
	
	public static void main(String[] args) {
		
		int arr[]= {4,0,9,8,6};
		
		try
		{		
		   for(int i=0;i<arr.length;i++)
		  {
			  try
			  {
			System.out.println(100/arr[i]);
			  }
			  catch(Exception e)
			  {
				  System.out.println(e);
			  }
		   }
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}

}
