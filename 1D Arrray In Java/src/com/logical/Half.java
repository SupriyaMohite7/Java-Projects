/*
 *  WAP to half sort the array in ascending and half in descending
 */
package com.logical;

import java.util.Arrays;

public class Half {
	public static void sort(int arr[])
	{
		for(int i=0;i<arr.length/2;i++)
		{
			for(int j=i+1;j<arr.length/2;j++)
			{
				if(arr[j]<arr[i])
				{
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		for(int i=arr.length/2;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[j]>arr[i])
				{
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		
	}

	public static void main(String[] args) {

		int arr[]= {8,7,5,4,9,7,8,2,5,3,4,16};
		System.out.println("Before Sorting :");
		System.out.println(Arrays.toString(arr));
		
		sort(arr);
		
		System.out.println("After Sorting :");
		System.out.println(Arrays.toString(arr));
	}

}
