package com.switchcase;

import java.util.Scanner;

public class Assi10 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int ch;
		System.out.println("Enter number 1 : ");
		int num1=sc.nextInt();
		System.out.println("Enter number 2 : ");
		int num2=sc.nextInt();
		if(num1>num2)
		{
			ch=0;
		}
		else
		{
			ch=1;
		}
		switch(ch)
		{
		case 0:
			
			System.out.println(num1+" is greater");
			break;
		case 1:
			System.out.println(num2+" is greater");
			break;
		}
	}

}
