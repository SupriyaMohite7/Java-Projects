package com.Basics;

import java.util.Arrays;
import java.util.Scanner;

public class Sum {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		
		int b[]=new int[] {10,20,30,40,50};
		
			System.out.println(Arrays.toString(b));
		
		System.out.println("-----------------------");
		int sum=0;
		int a[]=new int[5];
		a[0]=10;
		a[1]=20;
		a[2]=30;
		a[3]=40;
		a[4]=50;
		for(int i=0;i<a.length;i++)
		{
			sum=sum+a[i];
		}
		System.out.println("Addition is : "+sum);
		System.out.println("-----------------------");
		int c[]=new int[5];
		
		for(int j=0;j<c.length;j++)
		{
			System.out.println("Enter value :");
			c[j]=sc.nextInt();
		}
	
			System.out.println(Arrays.toString(c));
			sum=0;
			for(int i=0;i<c.length;i++)
			{
				sum=sum+c[i];
			}
			System.out.println("Addition is : "+sum);
			System.out.println("-----------------------");
		
	}

}
