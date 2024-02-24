package com.demo.whileloop;

public class CountDigits {

	public static void sep_digits(int n)
	{
		int rem,count=0;
		while(n!=0)
		{
			rem=n%10;
			n=n/10;
			count++;
		}
		System.out.println("count of digits is : "+count);
	}
	public static void main(String[] args) {

		sep_digits(14572548);
	}

}
