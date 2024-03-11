/*
/ *  Print cube of each number in array
 */
package com.Basics;

import java.util.Scanner;

public class CubeOfElements {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size : ");
		int size = sc.nextInt();

		int arr[] = new int[size];

		for (int i = 0; i < size; i++) {
			System.out.println("Enter Element : ");
			arr[i] = sc.nextInt();
			arr[i] = arr[i] * arr[i] * arr[i];
		}
		System.out.println("Cube of Each Element :  ");
		for (int i = 0; i < size; i++) {
			System.out.print(" " + arr[i]);
		}
	}

}
