package com.ForLoop;

import java.util.Scanner;

public class Assi12 {

	static int n=0;
	public static void table()
	{
		for(int i=1;i<=10;i++)
		{
			System.out.println(n*i);
		}
	}
	
	public static void main(String[] args) {


		Scanner sc=new Scanner(System.in);
		System.out.println("enter number :");
		n=sc.nextInt();
		table();
	}

}
