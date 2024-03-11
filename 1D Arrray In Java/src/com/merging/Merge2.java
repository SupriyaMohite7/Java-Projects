 // Alternate Merge
package com.merging;

import java.util.Arrays;

public class Merge2 {
	static int[] merge(int[] a1, int[] a2) {
		int len1=a1.length;
		int len2=a2.length;
		int[] mar=new int[len1+len2];
		
		int i,j,index=0;
		
		for(i=0 , j=0 ; i<len1 && j<len2 ; i++ , j++)
		{
			mar[index++]=a1[i];
			mar[index++]=a2[j];
		}
		while(i<len1)
		{
			mar[index++]=a1[i++];
		}
		while(j<len2)
		{
			mar[index++]=a2[j++];
		}
		return mar;
	}

	public static void main(String[] args) {

		int a1[]= {4,6,213,6,213,1,54,56,4,1,7,8,9};
		int a2[]= {68,46,65,65,46,1,213,56,6,15};
		int a3[]=merge(a1,a2);
		System.out.println(Arrays.toString(a1));
		System.out.println(Arrays.toString(a2));
		System.out.println("After Alternate Merge :");
		System.out.println(Arrays.toString(a3));
	}

	

}
