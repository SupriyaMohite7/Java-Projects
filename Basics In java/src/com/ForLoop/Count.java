package com.ForLoop;

import java.util.Scanner;

public class Count {
	public static int start,end;
static int count=0;
	public static void countloop() {
		for(int i=start;i<=end;i++)
		{
			count++;
		}
		System.out.println("count is :"+count);

	}
	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		System.out.println("enter start :");
		start=sc.nextInt();
		System.out.println("enter end :");
		end=sc.nextInt();
		countloop();
	}

}
