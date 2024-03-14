package com.assignments;
import java.util.Scanner;

/*
 * Write a Java program to count occurrences of a character in given string.
 */
public class CountCharacterOccurance {
	
	static int find(String s,char ch)
	{
		int count=0;
		for(int i=0;i<s.length();i++)
		{
			
			if(s.charAt(i)==ch)
			{
				count++;
			}
			
		}
		return count;
	}
	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter String :");
		String str=sc.next();
		char ch='r';
		System.out.println("count of "+ch+" in "+str+"  :"+find(str,ch));
	}

}
