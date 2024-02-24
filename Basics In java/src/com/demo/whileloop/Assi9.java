package com.demo.whileloop;

public class Assi9 {

	public static void sep_digits(int n)
	{
		int rem,count=0,product=1;
		while(n!=0)
		{
			rem=n%10;
			n=n/10;
			count++;
			product=product*rem;
		}
		System.out.println("count of digits is : "+count);
		System.out.println( "product : "+product);
	}

	public static void main(String[] args) {
		
		 {

			sep_digits(145222);
		}

	}

}
