package com.switchcase;

import java.util.Scanner;

public class Assi4 {
static int n1;
static int n2;
	public static int sum()
	{
		int sum = 0;
		sum=n1+n2;
		return sum;
	}
	public static int sub()
	{
		int sub = 0;
		sub=n1-n2;
		return sub;
	}
	public static int mul()
	{
		int mul = 0;
		mul=n1*n2;
		return mul;
	}
	public static int div()
	{
		int div = 0;
		div=n1/n2;
		return div;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter first number : ");
		 n1=sc.nextInt();
		System.out.println("Enter second number : ");
		 n2=sc.nextInt();
		 System.out.println("Enter choice : "
		 		+ "\n 1 Addition"
		 		+ "\n 2 Substraction"
		 		+ "\n 3 Multiplication"
		 		+ "\n 4 Division");
		 int ch=sc.nextInt();
		 switch(ch)
		 {
		 case 1:
		 {
			 sum();
				int sum=sum();
				System.out.println("sum : "+sum);
				break;
		 }
		 case 2:
		 {
			 int sub= sub();
				System.out.println("sub : "+sub());
				break;
		 }
		 case 3:
		 {
			 int mul=mul();
				System.out.println("mul : "+mul());
				break;
		 }
		 case 4:
		 {
			 int div=div();
				System.out.println("div : "+div);
				break;
		 }
		 default:
		 {
			 System.out.println("wrong choice");
		 }
		 }
		
	}

}
