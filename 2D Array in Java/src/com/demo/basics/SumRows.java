package com.demo.basics;

import java.util.Scanner;

public class SumRows {
	static void sum(int[][] ar)
	{
		
		for (int i = 0; i < ar.length; i++){
			int sum=0;
			for (int j = 0; j < ar[i].length; j++)
			{
				sum+=ar[i][j];
				System.out.print(ar[i][j]+" ");

			}
			System.out.println("sum :"+sum);
			}				


	}

	public static void main(String[] args) {


		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of rows :");
		int r = sc.nextInt();
		System.out.println("Enter number of columns :");
		int c = sc.nextInt();

		int arr4[][] = new int[r][c];

		for (int i = 0; i < arr4.length; i++) {
			System.out.println("enter value for row" + (i + 1) + " :");
			for (int j = 0; j < arr4[i].length; j++) {
				arr4[i][j] = sc.nextInt();
			}
		}
		
		sum(arr4);
		
	}

}
