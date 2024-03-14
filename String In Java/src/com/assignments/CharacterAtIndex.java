package com.assignments;
import java.util.Scanner;

/*
 * .Write a Java program to find occurrence of a character in a 
 * given string.
 */
public class CharacterAtIndex {
	static void find(String s,char ch)
	{
		int count=0;
		for(int i=0;i<s.length();i++)
		{
			
			if(s.charAt(i)==ch)
			{
				count++;
				System.out.println(ch+ " character in string "+s+ " is at index :"+i);

			}
			
		}
	}

	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter String :");
		String str=sc.next();
		System.out.println(str);
		char ch='r';
		find(str,ch);
		
	}
}
