package com.wordslogic;

public class IntegerSumInString {

	static void sum(String s)
	{
		int sum=0;
		char[] arr=s.toCharArray();
		for(int i=0;i<s.length();i++)
		{
			if(Character.isDigit(arr[i]))
			{
				int x=Character.getNumericValue(arr[i]);
				sum=sum+x;
			}
		}System.out.println("Sum :"+sum);
	}
	static void sum1(String s)
	{
		int sum=0;
		char[] arr=s.toCharArray();
		for(int i=0;i<s.length();i++)
		{
		if(arr[i]>=48 && arr[i]<=57)
		{
			int x=arr[i]-48;
			sum=sum+x;
		}
		}System.out.println("sum : "+sum);
	}
	public static void main(String[] args) {

		String s="sachin scores 456 marks.";
		sum(s);
		sum1(s);
	}

}
