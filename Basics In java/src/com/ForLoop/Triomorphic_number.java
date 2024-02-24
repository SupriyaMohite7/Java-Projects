package com.ForLoop;

public class Triomorphic_number {

	public static void Check(int n)
	{
		int ori_num=n;
		int sq,count=0,rem;
		double power;
		sq=n*n*n;
		while(n!=0)
		{
			rem=n%10;
			n=n/10;
			count++;
		}
		System.out.println("count : "+count);
		power=Math.pow(10, count);
		System.out.println("power : "+power);
		if(sq%power==ori_num)
		{
			System.out.println("It Is Triomorphic Number");
		}
		else
		{
			System.out.println("It Is Not Triomorphic Number");
		}
	}
	public static void main(String[] args) {

		Check(76);
	}
}
