package com.switchcase;

import java.util.Scanner;

public class Assi5 {

	public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter your choice : \n1\n2\n3\n4\n5\n6\n7");
		int ch=sc.nextInt();
		switch(ch)
		{
		
	case 1:
	{
		System.out.println("Monday");
		break;
	}
case 2:
{
	System.out.println("Tuesday");
	break;
}
case 3:
{
	System.out.println("Wednesday");
	break;
}
case 4:
{
	System.out.println("Thursday");
	break;
}
case 5:
{
	System.out.println("Friday");
	break;
}
case 6:
{
	System.out.println("Saturday");
	break;
}
case 7:
{
	System.out.println("Sunday");
	break;
}
		}
	}
}
