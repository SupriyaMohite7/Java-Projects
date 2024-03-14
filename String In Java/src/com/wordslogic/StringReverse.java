package com.wordslogic;

public class StringReverse {

	static void findrev(String st) {
		String rev = "";
		for (int i = st.length() - 1; i >= 0; i--) {
			rev = rev + st.charAt(i);
		}
		System.out.println(rev);
	}

	static void findrevWordByWord(String st) {
		String s[] = st.split(" ");
		String rev = "";
		for (int i = 0; i < s.length; i++) {
			for (int j = s[i].length() - 1; j >= 0; j--) {
				rev = rev + s[i].charAt(j);
			}
			rev = rev + " ";
		}
		System.out.println(rev);
	}

	public static void main(String[] args) {

		String str = "I love to learn programming";
		System.out.println(str);
		findrev(str);
		findrevWordByWord(str);
	}

}
