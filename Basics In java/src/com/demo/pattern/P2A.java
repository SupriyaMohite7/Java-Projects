/*
 1 0 1 0 1
1 0 1 0 1
1 0 1 0 1
1 0 1 0 1
1 0 1 0 1

 */
package com.demo.pattern;

public class P2A {

	public static void show(int row) {
		for (int i = 1; i <= row; i++) {
			for (int j = 1; j <= row; j++) {
				if (j % 2 == 0) {
					System.out.print("0 ");
				} else {
					System.out.print("1 ");
				}
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {

		show(7);
	}

}
