package com.ForLoop;

public class SeriesByAddition {

	public static void main(String[] args) {

		int first=0;
		int second = 1;
		System.out.println(first);
		System.out.println(second);
		int sum=first+second;
		for(int i=0;i<=10;i++)
		{
			sum=first+second;
					first=second;
							second=sum;
			System.out.println(""+sum);
		}
	}

}
