package com.switchcase;

import java.util.Scanner;

public class calc {

	public static int add(int a,int b)
	{
		return a+b;
	}
	public static int sub(int a,int b)
	{
		return a-b;
	}
	public static int mul(int a,int b)
	{
		return a*b;
	}
	public static int div(int a,int b)
	{
		return a/b;
	}
	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		char ch;
		do{
			int ans=0;
		
		System.out.println("Enter number : ");
		int a=sc.nextInt();
		System.out.println("Enter number : ");
		int b=sc.nextInt();
		System.out.println("Enter number : ");
		int c=sc.nextInt();
		System.out.println("Enter choice : \n1 Add \n2 Sub \n3 Mul \n4 Div");
		int choice=sc.nextInt();
		switch(choice)
		{
		case 1:
			ans=add(a,b);
			break;
		case 2:
			ans=sub(a,b);
			break;
		case 3:
			ans=mul(a,b);
			break;
		case 4:
			ans=div(a,b);
			break;
			default:
				System.out.println("You Entered wrong choice ");
		}
		System.out.println("answer is : "+ans);
		System.out.println("Do you want to continue : if yes type y ");
		ch=sc.next().charAt(0);
		}while(ch == 'y'||ch == 'Y');
	}

}
