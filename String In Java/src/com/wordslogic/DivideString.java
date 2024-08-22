package com.wordslogic;

import java.util.Arrays;

public class DivideString {
	
	static void divideString(String s,int noOfch)
	{
		int len=s.length();
		int ns=len/noOfch;
		if(len%noOfch!=0)
		{
			System.out.println("cannot divide into equal parts");
			int x=noOfch-(len%noOfch);
			for(int i=0;i<x;i++)
			{
				s=s+"#";
				// s=s.concat("#");
			}
		}
		
			len=s.length();
			 ns=len/noOfch;
			String spltstr[]=new String[ns];
			int index=0;
			for(int i=0;i<s.length();i+=noOfch)
			{
				spltstr[index]=s.substring(i, i+noOfch);
				index++;
			}
			System.out.println(Arrays.toString(spltstr));
		}
	
	
	public static void main(String[] args) {

		String arr[]= {"I","am","very","smart"};
		System.out.println(Arrays.toString(arr));
		String st=String.join("", arr);
		System.out.println(st);
		int noOfChar=5;
		divideString(st,noOfChar);
	}

}
