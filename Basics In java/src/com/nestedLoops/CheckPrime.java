package com.demo.nestedLoops;

public class CheckPrime {

	public static int count=0;
	public static void check(int n)
	{

		
		for(int i=2;i<=n/2;i++)
		{
			if(n%i==0)
			{
				count++;
				break;
			}
		}
		if(count==0)
		{
			System.out.println("it is prime number");
		}
		else
		{
			System.out.println("it is not prime number");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		check(17);
	}

}
