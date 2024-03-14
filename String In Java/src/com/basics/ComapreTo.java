package com.basics;

public class ComapreTo {

	public static void main(String[] args) {

		// Compare lexicographically
		// compare unicode of characters
		
		String s1="Abhi";
		String s2="Cat";
		
		System.out.println(s1.compareTo(s2)); // comparing first letter
		
		String s3="Abhi";
		String s4="Adi";
		
		System.out.println(s3.compareTo(s4)); // comparing second letter as first is same
		

		String s5="Adi";
		String s6="Adi";
		
		System.out.println(s5.compareTo(s6)); // all String are same  so 0
	

		String s7="adi";
		String s8="Adi";
		
		System.out.println(s7.compareTo(s8)); // case sensetive
		System.out.println(s8.compareTo(s7));
		
		String s9="adi";
		String s10=" Adi";
		
		System.out.println(s9.compareTo(s10)); // space also countable
		
	}

}
