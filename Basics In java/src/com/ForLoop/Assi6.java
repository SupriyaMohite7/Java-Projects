package com.ForLoop;

import java.util.Scanner;

public class Assi6 {

	static int n;
	public static void sum()
	{
		int sum=0;
		for(int i=1;i<=n;i++)
		{
			if(i%2==0)
			{
				sum=sum+i;
			}
			
		}System.out.println("sum of even numbers :"+sum);
	}
	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		System.out.println("enter number :");
		n=sc.nextInt();
		sum();
	}

}
