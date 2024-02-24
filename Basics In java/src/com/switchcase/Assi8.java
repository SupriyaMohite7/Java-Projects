package com.switchcase;

import java.util.Scanner;

public class Assi8 {


    public static void main(String[] args) {
    	Scanner sc=new Scanner(System.in);
		System.out.println("Enter day count : ");
		String day = sc.nextLine();
		switch(day)
		{
		case "one" :
			System.out.println("Monday");
			break;
		case "two" :
			System.out.println("Tuesday");
			break;
		case "three" :
			System.out.println("Wednesday");
			break;
		case "four" :
			System.out.println("Thursday");
			break;
		case "five" :
			System.out.println("Friday");
			break;
		case "six" :
			System.out.println("Saturday");
			break;
		case "seven" :
			System.out.println("Sunday");
			break;
		}
		
        }

       
    }
