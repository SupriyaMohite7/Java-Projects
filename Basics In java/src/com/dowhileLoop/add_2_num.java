package com.dowhileLoop;

import java.util.Scanner;

public class add_2_num {

	public static void add(int a,int b)
	{
		System.out.println("Addition is : "+(a+b));
	}
	public static void main(String[] args) {

		char ch;
		Scanner sc=new Scanner(System.in);
		do {
			System.out.println("Enter Number : ");
			int a=sc.nextInt();
			System.out.println("Enter Number : ");
			int b=sc.nextInt();
			add(a,b);
			System.out.println("Do you want to continue : if yes type y");
			ch=sc.next().charAt(0);
		}while(ch =='y'||ch =='Y');
		System.out.println("Thank you!!!");
	}

}
