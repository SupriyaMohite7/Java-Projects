//6. WAP to split string into 2 tokens where string is “HELLO$WORLD”
package com.assignments;

import java.util.Arrays;

public class split {

	public static void main(String[] args) {

		String s="HELLO$WORLD";
		String[] s1=s.split("O");
		System.out.println(Arrays.toString(s1));
	}

}
