package com.switchcase;

import java.util.Scanner;

public class Assi7 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);

		System.out.println("Enter number in between 1 to 5 : ");
		int ch=sc.nextInt();
		switch(ch)
		{
		case 1:
			System.out.println("ONE");
			break;
		case 2:
			System.out.println("TWO");
			break;
		case 3:
			System.out.println("THREE");
			break;
		case 4:
			System.out.println("FOUR");
			break;
		case 5:
			System.out.println("FIVE");
			break;
		default:
			System.out.println("please enter number in between 1 to 5");
		}
	}

}
