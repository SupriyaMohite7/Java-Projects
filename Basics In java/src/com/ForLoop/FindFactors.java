package com.ForLoop;

import java.util.Scanner;

public class FindFactors {

	public static int i,count=0;
	public static int Factors(int n)
	{
		for(i=1;i<=n;i++)
		{
			if(n%i==0)
			{
				System.out.println(i);
				count++;
			}
		}
		System.out.println("count is : "+count);
		return i;
		
	}
	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Number : ");
		int n = sc.nextInt();
		Factors(n);
	}

}
