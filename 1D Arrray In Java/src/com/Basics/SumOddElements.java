/*
 *  Traverse the array and find the sum of odd numbers in an array
 */
package com.Basics;

import java.util.Arrays;

public class SumOddElements {
	
	static void sum(int[] ar)
	{
		int sum=0;
		for(int i=0;i<ar.length;i++)
		{
			if((ar[i]%2)!=0)
			{
				sum+=ar[i];
			}
		}
		System.out.println("Sum : "+sum);
	}

	public static void main(String[] args) {

		int ar[]=new int[5];
		ar[0]=11;
		ar[1]=22;
		ar[2]=33;
		ar[3]=44;
		ar[4]=55;
		
		System.out.println(Arrays.toString(ar));
		
		sum(ar);
		
	}

}
