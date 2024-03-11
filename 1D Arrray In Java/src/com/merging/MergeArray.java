/*
 * Merge the two arrays as follows
     ar1={1,2,3}
      ar2={4,5,6,7,8}
 o/p: mar1={1,4,2,5,3,6,7,8}
      mar2={1,5,3,7,8}
 */
package com.merging;

import java.util.Arrays;

public class MergeArray {
	static int[] merge(int[] ar1, int[] ar2)
	{
		int index=0;
		int len=ar1.length+ar2.length;
		int res[]=new int[len];
		for(int i=0;i<ar1.length;i++)
		{
			res[index++]=ar1[i];
		}
		for(int i=0;i<ar2.length;i++)
		{
			res[index++]=ar2[i];
		}
		return res;
	}

	public static void main(String[] args) {
		int[] ar1 = { 1, 2, 3 };
		int[] ar2 = { 4, 5, 6, 7, 8 };
		int m[]=merge(ar1,ar2);
		System.out.println(Arrays.toString(ar1));
		System.out.println(Arrays.toString(ar2));
		System.out.println("After Merge : ");
		System.out.println(Arrays.toString(m));
	}

}
