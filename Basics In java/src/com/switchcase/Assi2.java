package com.switchcase;

import java.util.Scanner;

public class Assi2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number : ");
		int n1=sc.nextInt();
	
		switch(n1%2)
		{
		case 1:
			System.out.println("odd number");
			break;
		case 0:
			System.out.println("even number");
			break;
		}
	}

}
