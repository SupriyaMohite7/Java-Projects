package com.demo.whileloop;

import java.util.Scanner;

public class Number50 {
	
	public static void test()
	{
		int count=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any Number above 0 : ");
		int n=sc.nextInt();
		while(n>0)
		{
			
			if(n==50)
			{
				System.out.println("yesss..we found correct number");
				break;
			}
			else
			{
				if(n>50)
				{
					System.out.println(n+ " is larger number please enter lower number");	
					System.out.println("Enter any Number above 0 : ");
					 n=sc.nextInt();
				}
				else 
				{
					System.out.println(n+ " is smaller number please enter upper number");
					System.out.println("Enter any Number above 0 : ");
					 n=sc.nextInt();
				}
					
					count++;
			}
					}
		System.out.println("Count is :"+count);
		
	}

	public static void main(String[] args) {

		test();
	}

}
