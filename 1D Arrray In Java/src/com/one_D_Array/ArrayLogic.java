package com.one_D_Array;

public class ArrayLogic {

	static boolean searchElement(int ar[],int ele)
	{
		for(int i=0;i<ar.length;i++)
		{
			if(ar[i]==ele)
			{
				return true;
			}
			
		}return false;
	}
	static void searchElementOccurance(int ar[],int ele)
	{
		boolean flag=false;
		for(int i=0;i<ar.length;i++)
		{
			if(ar[i]==ele)
			{
				flag=true;
				System.out.println("position :"+i);
			}
			
		}if(flag)
		{
			System.out.println("element found");
		}
	}
	public static void main(String[] args) {

		int arr[]= {4,7,6,9,2,6,7};
		if(searchElement(arr,7))
		{
			System.out.println("element  found");
		}
		else
		{
			System.out.println("element not found");

		}
		System.out.println(".........................");
		searchElementOccurance(arr,9);
	}

}
