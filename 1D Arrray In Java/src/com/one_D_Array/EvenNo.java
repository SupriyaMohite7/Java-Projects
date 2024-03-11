package com.one_D_Array;

import java.util.Scanner;

public class EvenNo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		int c[] = new int[5];

		for (int j = 0; j < c.length; j++) {
			System.out.println("Enter value :");
			c[j] = sc.nextInt();
		}
		for (int j = 0; j < c.length; j++) {
			System.out.println("array :" + c[j]);

		}
		for (int j = 0; j < c.length; j++) {
			if(c[j]%2==0)
			{
				System.out.println("even no  :" + c[j]);
			}

		}
	}

}
