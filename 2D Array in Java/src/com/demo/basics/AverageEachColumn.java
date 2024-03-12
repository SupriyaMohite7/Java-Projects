package com.demo.basics;

import java.util.Arrays;

public class AverageEachColumn {


static void find(int[][] arr)
{
	
	
	for(int j=0;j<=arr.length;j++)
	{
		int sum=0;
	for(int i=0;i<arr.length;i++)
	{
	         sum=sum+arr[i][j];

	}	System.out.println("Sum of "+j+" column : "+(sum/3));

	}
	}


	public static void main(String args[])
	{
		int arr[][]={{2,4,9,7} , {6,5,3,10}, {7,3,6,4}};
		find(arr);

	

	}

}
