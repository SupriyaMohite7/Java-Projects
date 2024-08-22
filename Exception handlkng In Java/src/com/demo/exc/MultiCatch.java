package com.demo.exc;

import java.util.Scanner;

public class MultiCatch {
	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		
		try
		{
			int arr[]= new int[3];
			for (int i = 0; i <= arr.length; i++) {
				System.out.println("Enter a number:");
				arr[i] = sc.nextInt();
			}
			System.out.println("----------------------------");
			for (int i = 0; i < arr.length; i++) {
				System.out.println("ans :" + (100/arr[i]));
			}
			
			
		}		
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println(e);
		}
		catch(ArithmeticException e)
		{
			System.out.println(e);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		
		finally {
			sc.close();
			System.out.println("In finally");
		}
		
		System.out.println("Rest code");
	}

}
