package com.Basics;

import java.util.Arrays;
import java.util.Scanner;

public class SumEvenNo {

	static int sum=0;
	static void sumElements(int a[])
	{
		for(int i=0;i<a.length;i++)
		{
			if(a[i]%2==0)
			{
			sum=sum+a[i];
			}
		}
		System.out.println("Addition is : "+sum);	
	}
	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter Size :");
		int size=sc.nextInt();
		int array[]=new int[size];
		for(int j=0;j<=size-1;j++)
		{
			System.out.println("Enter element :");
			array[j]=sc.nextInt();	
		}
		
		System.out.println(Arrays.toString(array));
	
		SumEvenNo se=new SumEvenNo();
		se.sumElements(array);
	}

}
