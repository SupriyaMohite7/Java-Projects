package com.ForLoop;

import java.util.Scanner;

public class Testloop1 {

	public static void print() {
		int i;
		for (i = 1; i <= 5; i++) {
			System.out.println(i + " hello");
		}
	}

	public static void reverseprint() {
		int i;
		for (i = 5; i >= 1; i--) {
			System.out.println(i);
		}
	}

	public static void userinput(int end) {
		for (int i = 1; i <= end; i++) {
			System.out.println(i);
		}
	}

	public static void userinputboth(int start, int end) {
		for (int i = start; i <= end; i++) {
			System.out.println(i);
		}
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		print();
		reverseprint();
		userinput(20);
		
		System.out.println("enter start point :");
		int start = sc.nextInt();
		System.out.println("enter end point :");
		int end = sc.nextInt();
		userinputboth(start, end);
	}

}
