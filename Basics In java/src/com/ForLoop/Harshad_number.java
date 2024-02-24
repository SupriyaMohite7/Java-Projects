package com.ForLoop;

public class Harshad_number {

	static int rem, sum = 0;

	public static void count(int n) {
		int ori_num = n;
		while (n > 0) {
			rem = n % 10;
			sum = sum + rem;
			n=n/10;
		}
		System.out.println(sum);
	
	if (ori_num % sum == 0) {
		System.out.println("It IS An harshad number");
	} else {
		System.out.println("It IS Not harshad number");
	}
	}

	

	public static void main(String[] args) {
		count(18);
		
	}

}
