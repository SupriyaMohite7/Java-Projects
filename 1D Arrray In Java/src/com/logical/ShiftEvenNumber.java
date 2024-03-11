/*
 * 2>>Shift all the even number at the end of array using temporary array 
 */
package com.logical;

import java.util.Arrays;

public class ShiftEvenNumber {
	static void find_shift(int[] a)
	{
		int count=0;
		int oddIndex =a.length-1,evenIndex=0;
		for(int i=0;i<a.length-1;i++)
		{
			if(a[i]%2==0)
			{
				a[oddIndex]=a[i];
				oddIndex--;
				count++;
			}
			else
			{
				a[evenIndex]=a[i];
				evenIndex++;
				count++;
			}
		}
		if(count<a.length)
		{
			a[count++]=0;
		}
	}
	
	public static void main(String args[])
	{
		int a[]= {1,6,5,8,4,7,9,3,2,55,7,88,3,222};
		System.out.println("Original Array : ");
		System.out.println(Arrays.toString(a));
		find_shift(a);
		System.out.println("After Sorting : ");
		System.out.println(Arrays.toString(a));

	}

}
