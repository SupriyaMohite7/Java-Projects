// All marge
package com.merging;

import java.util.Arrays;

public class Merge1 {
	static int[] merge(int[] a1, int[] a2)
	{
		int len1=a1.length;
		int len2=a2.length;
		int index=0;
		int merge[]=new int[len1+len2];
		for(int i=0;i<len1;i++)
		{
			merge[index++]=a1[i];
		}
		for(int i=0;i<len2;i++)
		{
			merge[index++]=a2[i];
		}
		return merge;
		
	}

	public static void main(String[] args) {

		int a1[]= {4,6,213,6,213,1,54,56,4,1};
		int a2[]= {68,46,65,65,46,1,213,56,6,15};
		int a3[]=merge(a1,a2);
		System.out.println(Arrays.toString(a1));
		System.out.println(Arrays.toString(a2));
		System.out.println("After All Merge :");
		System.out.println(Arrays.toString(a3));
	}

}
