package com.switchcase;

import java.util.Scanner;

public class Assi1 {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter your choice : "
				+ "\n 1 Janewary"
				+ "\n 2 feb"
				+ "\n 3 march"
				+ "\n 4 april"
				+ "\n 5 may"
				+ "\n 6 June"
				+ "\n 7 July"
				+ "\n 8 Aug"
				+ "\n 9 sept"
				+ "\n 10 oct"
				+ "\n 11 nov"
				+ "\n 12 dec");
		int ch=sc.nextInt();
		switch(ch)
		{
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:	{
			System.out.println("31 days");
			break;}
		case 4:
		case 6:
		case 9:
		case 11:
		{
			System.out.println("30 days");
		break;}
		case 2: 
			{
				System.out.println("28 days");
				}
			}
	}

}
