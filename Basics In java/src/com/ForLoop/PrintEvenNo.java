package com.ForLoop;

public class PrintEvenNo {
	
	public static void PrintEvenNo()
	{
		for(int i=1;i<=50;i++)
		{
			if(i%2==0)
			{

				System.out.println(i);
			}
		}
	}
	public static void PrintOddNo()
	{
		for(int i=1;i<=50;i++)
		{
			if(i%2==1)
			{
				System.out.println(i);
			}
		}
	}
	public static void DivisibleBy5()
	{
		for(int i=1;i<=50;i++)
		{
			if(i%5==0)
			{
				System.out.println(i);
			}
		}
	}
	public static void main(String[] args) {
		System.out.println("Even numbers");
		PrintEvenNo();
		System.out.println("Odd numbers");
		PrintOddNo();
		System.out.println("Numbers divisible by 5");
		DivisibleBy5();
	}

}
