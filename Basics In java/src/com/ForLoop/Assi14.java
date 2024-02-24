package com.ForLoop;

import java.util.Scanner;

public class Assi14 {


	static int base, index,power=1;

	public static void power()
	{
		for(int i=1;i<=index;i++)
		{
			power=power*base;
		}
		System.out.println("power is :"+power);
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter base :");
		base = sc.nextInt();
		System.out.println("Enter index :");
		index = sc.nextInt();
		power();
	}

}
