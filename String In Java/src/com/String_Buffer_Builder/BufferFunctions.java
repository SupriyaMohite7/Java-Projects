package com.String_Buffer_Builder;

public class BufferFunctions {

	public static void main(String[] args) {

		StringBuffer sb = new StringBuffer();
		sb.append("programs");
		sb.reverse();

		System.out.println(sb);

		String s = "Java is fun";
		StringBuilder sb1 = new StringBuilder(s);
		sb1.reverse();

		System.out.println(sb1);

		sb.reverse();
		System.out.println(sb);

		sb.replace(2, 5, "java");
		System.out.println(sb);

		sb.insert(1, "code");
		System.out.println(sb);

		System.out.println(sb.length());
		System.out.println(sb.charAt(2));

		sb.delete(1, 3);
		System.out.println(sb);
		sb.deleteCharAt(sb.length() - 1);
		System.out.println(sb);

		System.out.println(sb.indexOf("java"));

		sb.setCharAt(1, 'p');
		System.out.println(sb);

	}

}
