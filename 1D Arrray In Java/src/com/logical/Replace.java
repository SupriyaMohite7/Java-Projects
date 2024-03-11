/*
 * WAP to replace the negative elements in an array 


 * with immendiate left elements square
    ar={1,2,-3,2,-4,-6}
    o/p={1,2,4,2,4,16}
 */
package com.logical;

import java.util.Arrays;

public class Replace {
	public static void replace(int ar[])
	{
		for(int i=0;i<ar.length;i++)
		{
			if(ar[i]<0)
			{
				ar[i]=ar[i-1]*ar[i-1];
			}
			else
			{
				ar[i]=ar[i];
			}
		}
	}

	public static void main(String[] args) {

		int ar[]= {1,2,-3,2,-4,-6};
		System.out.println(Arrays.toString(ar));
		replace(ar);
		System.out.println("After Updation : ");
		System.out.println(Arrays.toString(ar));
	}

}
