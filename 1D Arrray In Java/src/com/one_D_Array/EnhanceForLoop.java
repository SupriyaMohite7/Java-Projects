package com.one_D_Array;

import java.util.Scanner;

public class EnhanceForLoop {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		int sum=0;
		int ar[]= {1,2,3,4,5,6};
		for(int x:ar)
		{
			System.out.println(x);
		}
		for(int x:ar)
		{
			if(x%2==0)
			{
				sum+=x;
			}
		}			System.out.println("sum : "+sum);

		int arr[]=new int[3];
		System.out.println("Enter elements :");
		for(int x:arr)
		{
			x=sc.nextInt();
		}
		for(int x:arr)
		{
			System.out.println(x);
		}
	}

}
/*
 * we cannot use enhance for loop where we refer index and if there is any 
 * updation or changes in element.
 * */
