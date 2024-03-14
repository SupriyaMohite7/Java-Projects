package com.basics;

public class StringIntro {

	public static void main(String[] args) {

		String s1="java";
		String s2="java";
		
		String s3=new String("java"); //id is different
		String s4=new String("code");
		String s5=new String("code");
		
		char[] s6= {'j','a'};
		char[] s7= {'j','a'};
		
		System.out.println("s1 : "+s1.hashCode());
		System.out.println("s2 : "+s2.hashCode());
		System.out.println("s3 : "+s3.hashCode());
		System.out.println("s4 : "+s4.hashCode());
		System.out.println("s5 : "+s5.hashCode());
		System.out.println("s6 : "+s6.hashCode());
		System.out.println("s7 : "+s7.hashCode());
		
		System.out.println("s1 length : "+s1.length()); // does not end eith\0
	}

}
