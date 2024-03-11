package com.merging;

import java.util.Arrays;

public class Merge3 {

	static int[] mergeAlternateSkip(int a1[], int a2[]) {
		int len1 = a1.length;
		int len2 = a2.length;
		int maxLength = Math.max(len1, len2);
		int mar[] = new int[maxLength];
		int index = 0;
		int i = 0;
		while (index < maxLength) {
			if (i < a1.length) {
				mar[index++] = a1[i++];
			}
			if (i < a2.length) {
				mar[index++] = a2[i++];
			}
		}

		return mar;
	}

	public static void main(String[] args) {

		int arr1[] = { 6, 7, 12, 5 };
		int arr2[] = { 10, 20, 30, 40, 90, 100 };

		System.out.println(Arrays.toString(arr1));
		System.out.println(Arrays.toString(arr2));

		int m2[] = mergeAlternateSkip(arr1, arr2);
		System.out.println("After complete merge alternate:");
		System.out.println(Arrays.toString(m2));

	}

}
