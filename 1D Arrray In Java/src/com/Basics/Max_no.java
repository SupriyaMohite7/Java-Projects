package com.Basics;

import java.util.Scanner;

public class Max_no {

	public static int max_no(int[] arr) {
		int max = arr[0];
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > max) {
				max = arr[i];
			}
		}
		return max;
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size : ");
		int size = sc.nextInt();

		int arr[] = new int[size];

		for (int i = 0; i < size; i++) {
			System.out.println("Enter Element : ");
			arr[i] = sc.nextInt();
		}

		int max_number = max_no(arr);
		System.out.println("Max number in array: " + max_number);
	}

}
