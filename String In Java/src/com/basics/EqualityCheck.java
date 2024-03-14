package com.basics;

public class EqualityCheck {

	public static void main(String[] args) {

		String s1="java";
		String s2="java";
		
		// compare reference to object
		System.out.println(s1==s2);
		
		// comapare contents
		System.out.println(s1.equals(s2));
		
		String s3=new String("java");
		System.out.println(s1==s3);
		System.out.println(s1.equals(s3));
		
		System.out.println(s2==s3);
		System.out.println(s2.equals(s3));

	}

}
