package com.demo.whileloop;

import java.util.Scanner;

public class SumNaturalNumbers {

	
	public static int Sum(int n)
	{
		 int sum=0,i=1;
		while(i<=n)
		{
			sum=sum+i;
			i++;
		}
		return sum;
	}
	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		System.out.println("enter number :---");
		int n=sc.nextInt();
		int sum=Sum(n);
		System.out.println("Sum is :"+sum);
	}

}
