package com.ifelse;

import java.util.Scanner;

public class Assi1 {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter first number : ");
		int n1=sc.nextInt();
		System.out.println("Enter second number : ");
		int n2=sc.nextInt();
		if(n1>n2)
		{
			System.out.println(n1+ " is largest number");

		}else if(n2>n1)
		{
			System.out.println(n2+ " is largest number");

		}
		else
		{
			System.out.println("Both Are Equal");

		}
	}
	}

