/*
 * 1> Find the max and minimum number from an array and swap their
 
 *  positions
eg:{1,2,3,4,5,6}
o/p:{6,2,3,4,5,1}

 */
package com.logical;

import java.util.Arrays;

public class Min_value_swap {
	static int min=0;
	static int max=0;
	static void find_swap(int[] ar)
	{
		
		for(int i=0;i<ar.length-1;i++)
		{
			for(int j=i+1;j<ar.length-1;j++)
			{
				if(ar[j]<ar[i])
				{
					min=j;
				}
			}
		}
		for(int i=0;i<ar.length-1;i++)
		{
			for(int j=i+1;j<ar.length;j++)
			{
				if(ar[j]>ar[i])
				{
					max=j;
				}
			}
			int temp=ar[min];
			ar[min]=ar[max];
			ar[max]=temp;
		}
		
		
	}
	public static void main(String[] args) {

		int ar[]= {1,2,3,4,5,6};
		System.out.println("Original Array :");
		System.out.println(Arrays.toString(ar));
		find_swap(ar);
		System.out.println("After Swapping :");
		System.out.println(Arrays.toString(ar));

	}

}
