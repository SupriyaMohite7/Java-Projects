/*
 * Write a program to reverse an array in following manner.
   Suppose array size is even then later half should come first and first
    half should go last. E.g. input array { 1,2,5,7,3,4} output will be
     { 7,3,4, 1,2,5}. If array size is odd then middle element should 
     remain as it is and array will be reversed as above. E.g. 
     input array { 5,22,55,21,4,54,10} output will be 
    {4,54,10,21,5,22,55}
 */
package com.Basics;

import java.util.Arrays;

public class Reverse {

	static void reverse_even(int[] a1) {
		int l = a1.length;
		int mid = l / 2;
		for (int i = 0; i < mid; i++) {
			int temp = a1[i];
			a1[i] = a1[mid + i];
			a1[mid + i] = temp;

		}
	}

	static void reverse_odd(int[] a2) {
		int l = a2.length;
		int mid = l / 2;
		for (int i = 0; i < mid; i++) {
			int temp = a2[i];
			a2[i] = a2[mid + i + 1];
			a2[mid + i + 1] = temp;

		}
	}

	public static void main(String[] args) {

		int a1[] = { 1, 2, 5, 7, 3, 4 };
		int a2[] = { 5, 22, 55, 21, 4, 54, 10 };

		System.out.println(Arrays.toString(a1));
		System.out.println(Arrays.toString(a2));

	
		reverse_even(a1);

		reverse_odd(a2);
		System.out.println("After reverse : ");
		System.out.println(Arrays.toString(a1));
		System.out.println(Arrays.toString(a2));

	}

}
