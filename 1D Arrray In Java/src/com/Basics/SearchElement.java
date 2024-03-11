package com.Basics;

import java.util.Scanner;

public class SearchElement {
	public static void searchElement(int arr[], int ele) {

		boolean isElementFound = false;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == ele) {
				isElementFound = true;
				break;
			}

		}
		String res = isElementFound == true ? "Element Found" : "Element Not Found";

		System.out.println(res);
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
		System.out.println("Enter element to search :");
		int ele = sc.nextInt();
		searchElement(arr, ele);

	}

}
