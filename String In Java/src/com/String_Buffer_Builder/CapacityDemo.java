package com.String_Buffer_Builder;
// String Buffer and String Builder are same till now.
public class CapacityDemo {

	public static void main(String[] args) {

		StringBuffer sb=new StringBuffer();
		sb.append("hello");
		System.out.println(sb.capacity());
		
		StringBuffer sb1=new StringBuffer("hello");
		System.out.println(sb1.capacity());

		StringBuffer sb2=new StringBuffer(5);
		sb2.append("java");
		System.out.println(sb2.capacity());

		sb2.append("sql");
		System.out.println(sb2.capacity()); // (oldcap*2)+2
											// (5*2)+2=12

		System.out.println("=======================================");
		
		StringBuilder nsb=new StringBuilder();
		nsb.append("hello");
		System.out.println(nsb.capacity());
		
		StringBuilder nsb1=new StringBuilder("hello");
		System.out.println(nsb1.capacity());

		StringBuilder nsb2=new StringBuilder(5);
		nsb2.append("java");
		System.out.println(nsb2.capacity());

		nsb2.append("sql");
		System.out.println(nsb2.capacity()); // (oldcap*2)+2
											// (5*2)+2=10
	}

}
