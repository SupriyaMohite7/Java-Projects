// WAP to find the duplicate and unique words in a string

package com.assignments;

import java.util.Arrays;

public class DuplicateUnique {
	static void find(String s) {
		String[] st = s.split(" ");
		System.out.println(Arrays.toString(st));
		for (int i = 0; i < st.length; i++) {
			int count = 0;
			for (int j = st.length - 1; j >= 0; j--) {
				if (st[i].equalsIgnoreCase(st[j])) {
					count++;
				
				}
			}
			
			System.out.println(st[i] + " : " + count);
			
		}
	}

	public static void main(String[] args) {

		String str = "java is programming language . I love programming . "
				+ "so I love java ";
		System.out.println(str);
		find(str);
	}

}
