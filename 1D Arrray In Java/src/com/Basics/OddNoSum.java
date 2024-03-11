/*
 * 1. Traverse the array and find the sum of odd elements in an array
 */
package com.Basics;

import java.util.Scanner;

public class OddNoSum {
		public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int sum=0;
		
		System.out.println("Enter size of array : ");
		int size=sc.nextInt();
		int arr[]=new int[size];

		for(int i=0;i<size;i++)
		{
			System.out.println("Enter Element : ");
			arr[i]=sc.nextInt();
		}
		for(int i=0;i<size;i++)
		{
			System.out.println(" "+arr[i]);
		}
		OddNoSum os=new OddNoSum();
		for(int i=0;i<arr.length;i++)
		{
			if((arr[i]%2)!=0)
			{
				sum=sum+arr[i];
			}
			
		}System.out.println("Sum of odd elements : "+sum);
		
	}

}
