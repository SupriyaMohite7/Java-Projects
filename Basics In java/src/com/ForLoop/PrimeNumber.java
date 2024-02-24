package com.ForLoop;

import java.util.Scanner;

public class PrimeNumber {

	public static int n,i,count=0;
	public static int primenum(int n)
	{
		for(i=1;i<=n;i++)
		{
			if(n%i==0)
			{
				System.out.println(i);
				count++;
			}
		}
		return i;
	}
	
	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number : ");
		n=sc.nextInt();
		primenum(n);
		if(count==2)
		{
			System.out.println("it is prime number");
		}
		else
		{
			System.out.println("it is non-prime number");
		}
	}

}
