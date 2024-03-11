/*
 * Reverse the array
 */
package com.Basics;

import java.util.Arrays;
import java.util.Scanner;

public class ReverseArray {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size : ");
		int size = sc.nextInt();

		int arr[] = new int[size];

		for (int i = 0; i < size; i++) {
			System.out.println("Enter Element : ");
			arr[i] = sc.nextInt();
		}

		int revarr[] = new int[size];
		int j = 0;
		for (int i = arr.length - 1; i >= 0; i--) {
			revarr[j] = arr[i];
			j++;
		}

		for (int i = 0; i < size; i++) {
			System.out.println(revarr[i]);
		}
		System.out.println("Original Array : ");
		System.out.println(Arrays.toString(arr));
		System.out.println("After Reverse : ");
		System.out.println(Arrays.toString(revarr));
	}

}
