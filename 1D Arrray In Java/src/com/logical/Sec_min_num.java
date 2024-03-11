
package com.logical;

import java.util.Arrays;

public class Sec_min_num {

	public static int find_min(int arr[])
	{
		int min=Integer.MIN_VALUE;
		int sec_min=Integer.MIN_VALUE;

		for(int x:arr)
		{
			if(x>min)
			{
				min=x;
				sec_min=min;
			}
			else if(sec_min<x)
			{
				sec_min=x;
			}
		}
		return sec_min;
	}
	public static void main(String[] args) {

		int arr[]= {8,4,5,6,7,1,65,4,8,1,2,85,472};
		System.out.println("Before Sorting :");
		System.out.println(Arrays.toString(arr));
		
		int sm=find_min(arr);
		
		System.out.println("Maximum value is :"+sm);
	}

}
