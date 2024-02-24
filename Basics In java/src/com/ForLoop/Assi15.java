package com.ForLoop;

import java.util.Scanner;

public class Assi15 {

	static int n,sum,product;
	public static void main(String args[])
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("enter a number :");
		n=sc.nextInt();
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=n;j++)
			{
				 product=i*n;
			}
			
			sum=sum+product;
		}			System.out.println(sum);

	}

}
