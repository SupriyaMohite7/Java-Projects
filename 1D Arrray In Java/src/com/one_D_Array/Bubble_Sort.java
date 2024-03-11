package com.one_D_Array;

import java.util.Arrays;

public class Bubble_Sort {

	public static void sort(int arr[])
	{
		for(int i=0;i<arr.length-1;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[j]<arr[i])
				{
				int temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
				}}
		}
	}
	public static void main(String[] args) {

		int arr[]= {5,9,4,3,7,1,8,3};
		
		System.out.println("Before Sorting : ");
		System.out.println(Arrays.toString(arr));
		
		sort(arr);
		
		System.out.println("After Sorting : ");
		System.out.println(Arrays.toString(arr));
	}

}
