package com.demo.basics;

import java.util.Scanner;

public class CreateArray {

	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) {

		int row=3;
		int col=4;
		int arr[][]=new int[row][col];
		
		int no=1;
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<col;j++)
			{
				arr[i][j]=no;
				no++;
			}
		}
		
		for(int i=0;i<row;i++)
		{
			for(int a:arr[i])
			{
				System.out.print(a+" ");
			}
			System.out.println();
		}
		System.out.println("===================================");

		for(int i=0;i<row;i++)
		{
			for(int j=0;j<col;j++)
			{
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();

		}
		System.out.println("===================================");
		
//		int arr2[][] = new int[][]{(1,1),(2,2)};
//		int arr3[][] = {(1,1),(2,2),(3,3),(4,4)};
//
//		for(int i=0;i<arr2.length;i++)
//		{
//			for(int a:arr2[i])
//			{
//				System.out.print(a+" ");
//			}
//			System.out.println();
//		}
//		for(int i=0;i<arr2.length;i++)
//		{
//			for(int j=0;j<arr2[i].length;j++)
//			{
//				System.out.print(arr2[i][j]+" ");
//			}
//			System.out.println();
//		}

		int arr4[][]=new int[3][3];
		
		for(int i=0;i<arr4.length;i++)
		{
			System.out.println("enter value for row"+(i+1)+" :");
			for(int j=0;j<arr4[i].length;j++)
			{
				arr4[i][j]=sc.nextInt();
			}
		}
		for(int i=0;i<arr4.length;i++)
			{
				for(int j=0;j<arr4[i].length;j++)
				{
					System.out.print(arr4[i][j]+" ");
				}
				System.out.println();
			}
		
	}

}
