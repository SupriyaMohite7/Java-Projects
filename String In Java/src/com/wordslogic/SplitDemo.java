package com.wordslogic;

import java.util.Arrays;

public class SplitDemo {

	public static void main(String[] args) {

		String str="I love to learn programming";
		String[] s=str.split(" ");
		System.out.println(Arrays.toString(s));
		
		String str1="I lo\tve to lea\trn progra\tmming";
		String[] s1=str1.split("\t");
		System.out.println(Arrays.toString(s1));
	}
	}


