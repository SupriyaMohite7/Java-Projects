package com.basics;

public class StringMutable {

	public static void main(String[] args) {

		// mutable means we can not change the value.
		
		String s1="java";
		s1.concat("program");
		System.out.println(s1);
		
		String s2="java";
		s2=s2.concat("program"); //object is created in heap then s2 points to it
		System.out.println(s2);
		
		String s3="javaprogram";
		System.out.println(s3);

		System.out.println(s2.hashCode());
		System.out.println(s3.hashCode());
		// both are pointing to same in scp so same hashcode
		System.out.println(s2==s3);
		System.out.println(s2.equals(s3));
	}

}
// when object is returned then object is created only in heap not in scp

