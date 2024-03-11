package com.shifting;

import java.util.Arrays;

public class SeperateNegative {

	static void shiftneg(int ar[]) {
		int left = 0;
		int right = ar.length - 1;

		while (left < right) {
			while (ar[left] > 0 && left < right)
				left++;
			while (ar[right] < 0 && left < right)
				right++;
			if (left < right) {
				int temp = ar[left];
				ar[left] = ar[right];
				ar[right] = temp;
				left++;
				right--;
			}

		}

	}

	static void shiftneg2(int ar[]) {
		for (int i = 1; i < ar.length; i++) {
			for (int j = ar.length - 1; j >= 0; j--) {
				if (ar[i] < 0 && i < j) {
					int temp = ar[j];
					ar[j] = ar[i];
					ar[i] = temp;
				}
			}
		}
	}

	public static void main(String[] args) {

		int ar[] = { 1, 5, -4, 9, -7, 2, 5, -7, -6, 9, 1, 3 };
		System.out.println("Before Updation : ");
		System.out.println(Arrays.toString(ar));
		System.out.println("After Updation : ");
		shiftneg(ar);
		System.out.println(Arrays.toString(ar));
		shiftneg2(ar);
		System.out.println(Arrays.toString(ar));

	}

}
