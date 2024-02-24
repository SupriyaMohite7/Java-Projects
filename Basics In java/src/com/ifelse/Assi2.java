package com.ifelse;

import java.util.Scanner;

public class Assi2 {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter first number : ");
		int n1=sc.nextInt();
		System.out.println("Enter second number : ");
		int n2=sc.nextInt();
		if(n1==n2)
		{
			System.out.println("Numbers are equal");
		}
		else
		{
			System.out.println("Numbers are not equal");
		}
	}

}
