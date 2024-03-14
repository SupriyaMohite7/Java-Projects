package com.basics;

public class CountDigitsInString {
	
	static int findDigits(String s)
	{
		char[] ch=s.toCharArray();
		int count=0;
		for(char c:ch)
		{
			if(Character.isDigit(c))
			{
				count++;
			}
		}
		return count;
	}

	public static void main(String[] args) {

		String str="java is fun.159753. i love programming.";
		System.out.println("Digits  :"+findDigits(str) );
	}

}
