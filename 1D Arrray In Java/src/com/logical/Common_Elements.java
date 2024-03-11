/*
 * Find the common elements between the two arrays

 */
package com.logical;

import java.util.Arrays;

public class Common_Elements {
	static void find_common(int[] a1,int[] a2,int res[])
	{
		int count=0;
		for(int i=0;i<a1.length-1;i++)
		{
			for(int j=0;j<a2.length-1;j++)
			{
				if(a1[i]==a2[j])
				{
					res[i]=a1[i];
					count++;
				}
				else
				{
				
				}
				
			}
		}
	}

	public static void main(String[] args) {

		int a1[]= {7,8,6,3,4,1,2,6,6,6,6};
		int a2[]= {1,5,9,7,8,1,2,3,4,5};
		int res[]=new int[a1.length];
		System.out.println(Arrays.toString(a1));
		System.out.println(Arrays.toString(a2));
		find_common(a1,a2,res);
		System.out.println(Arrays.toString(res));

	}

}
