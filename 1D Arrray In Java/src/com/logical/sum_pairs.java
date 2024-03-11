package com.logical;

import java.util.Arrays;

public class sum_pairs {

	public static void findPairs(int ar[],int sum)
	{
		for(int i=0;i<ar.length;i++)
		{
			for(int j=i+1;j<ar.length;j++)
			{
				if(ar[i]+ar[j]==sum)
				{
					System.out.println("( "+ar[i]+","+ar[j]+" )");
				}
			}
		}
	}
	public static void main(String[] args) {

		int ar[]= {4,9,8,3,7,1,2,5,6};
		int sum=10;
		System.out.println(Arrays.toString(ar));
		System.out.println("-----------------------");
		System.out.println("Pairs are below :");
		findPairs(ar,sum);
	}

}
