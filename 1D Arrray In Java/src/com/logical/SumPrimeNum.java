/*
 * Find the sum of prime numbers in array using enhanced for loop
 */
package com.logical;

public class SumPrimeNum {

	public static void main(String[] args) {
		int sum = 0;
		int arr[] = { 7, 5, 4, 6, 2, 1, 9, 3, 8 };

		for (int x : arr) {
			System.out.println(x);
			
		}
		System.out.println("------------------------------");
		for (int x : arr) {
			boolean flag=false;
			if(x>2) {
			for (int i = 2; i < x; i++) {
				if (x % i == 0) {
					flag=true;

				}
			}
			if(flag==false)
			{
				sum += x;
				System.out.println("prime number : " + x);
			}
		}
		}
		System.out.println("sum : " + sum);
	}

}
