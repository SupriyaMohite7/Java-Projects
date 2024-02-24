package com.switchcase;

import java.util.Scanner;

public class Assi9 {

	static double a;
	public static double circle(int r) {
		double a = 3.14 * r * r;
		return a;
	}
	public static int square(int n)
	{
		int a=n*n;
		return a;
	}
	public static double RAT(int base,int height)
	{
		a=0.5*base*height;
		return a;
		
	}
	public static double reactangle(int length,int width)
	{
		a=length*width;
		return a;
		
	}
	public static double circumference(int radius)
	{
		a=2*3.14*radius;
		return a;
		
	}
	public static double perimeter(int side)
	{
		a=4*side;
		return a;
		
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your choice : \n 1 Area of circle" 
											 + "\n 2 area of square"
											 + "\n 3 Right angle triangle"
											 + "\n 4 Area of a rectangle"
											 + "\n 5 Circumference of a circle "
											 + "\n 6 Perimeter of a square ");
		int ch = sc.nextInt();
		switch (ch) {
		case 1:
		{
			double a = circle(5);
			System.out.println("Area of Circle : " + a);
			break;
		}
		case 2:
		{
			int a=square(4);
			System.out.println("Area of Square : " + a);
			break;
		}
		case 3:
		{
			System.out.println("enter base : ");
			int base= sc.nextInt();
			System.out.println("enter height : ");
			int height=sc.nextInt();
			RAT(base,height);
			System.out.println("Area of Right Angle Triangle : " + a);
			break;
		}
		case 4:
		{
			System.out.println("enter length : ");
			int length= sc.nextInt();
			System.out.println("enter width : ");
			int width=sc.nextInt();
			reactangle(length,width);
			System.out.println("Area of Reactangle : " + a);
			break;
		}
		case 5:
		{
			System.out.println("enter radius : ");
			int radius= sc.nextInt();
			circumference(radius);
			System.out.println("circumference of circle  : " + a);
			break;
		}
		case 6:
		{
			System.out.println("enter side : ");
			int side= sc.nextInt();
			perimeter(side);
			System.out.println("perimeter of square  : " + a);
			break;
		}
		
			

		}
	}

}
