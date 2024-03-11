package com.Basics;

import java.util.Arrays;
import java.util.Scanner;

public class Alternate_numbers {

	public static void alter(int arr[])
	{

		for(int i=0;i<arr.length;i++)
		{
			if(i%2==0)
			{
				System.out.println(arr[i]);
			}
		}
	}
	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter size : ");
		int size=sc.nextInt();
		
		int arr[]=new int[size];
		
		for(int i=0;i<size;i++)
		{
			System.out.println("Enter Element : ");
			arr[i]=sc.nextInt();
		}
		System.out.println(Arrays.toString(arr));
		System.out.println("Alternate numbers are :");
	alter(arr);	
	}

}
