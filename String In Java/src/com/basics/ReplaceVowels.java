package com.basics;

public class ReplaceVowels {

	static String replaceVowels(String s) {

		char ch[] = s.toCharArray();

		for (int i = 0; i < ch.length; i++) {
			if (i == ' ' | i == '.')
				continue;

			if (ch[i] == 'A' || ch[i] == 'E' || ch[i] == 'I' || ch[i] == 'O' || ch[i] == 'U' || ch[i] == 'a'
					|| ch[i] == 'e' || ch[i] == 'i' || ch[i] == 'o' || ch[i] == 'u') {
				ch[i] = '$';
			}

		}
		String s1 = new String(ch);
		return s1;
	}

	public static void main(String[] args) {
		String str = "program is fun.i love programming.";
		System.out.println(str);
		String newstr = replaceVowels(str);
		System.out.println(newstr);
	}

}
