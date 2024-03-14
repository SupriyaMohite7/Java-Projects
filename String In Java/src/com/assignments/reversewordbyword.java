/*
 *  WAP to reverse the string word by word keepin first and last as it is 
 */
package com.assignments;

public class reversewordbyword {

	static void reverse(String s) {
		char ch[]=s.toCharArray();
		String rev = "";
		for (int i = s.length() - 1; i >= 1; i--) {
		
			rev = rev + s.charAt(i);

		}
		rev =  s.charAt(0)+rev+s.charAt(s.length()-1);

		System.out.println(rev);
	}

	public static void main(String[] args) {
		String str = "JAVAProgram";
		reverse(str);
	}
}
