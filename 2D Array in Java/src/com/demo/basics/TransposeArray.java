package com.demo.basics;

import java.util.Scanner;

public class TransposeArray {
	static void display(int[][] ar) {
		for (int i = 0; i < ar.length; i++) {
			for (int j = 0; j < ar[i].length; j++) {
				System.out.print(ar[i][j] + " ");
			}
			System.out.println();
		}
	}

	static int[][] transpose(int[][] ar, int row, int col) {

		int tr[][]=new int[col][row];
		for (int i = 0; i < ar.length; i++) {
			for (int j = 0; j < ar[i].length; j++) {
				tr[j][i]=ar[i][j];
			}
			}
		return tr;
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

		display(arr4);
		System.out.println("After Transpose :");
		int tr[][] = transpose(arr4,r,c);
		display(tr);
	}

}
