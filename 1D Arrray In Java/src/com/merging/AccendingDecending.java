// first middle and last element constant
// first half decending
// second half ascending
package com.merging;

import java.util.Arrays;

public class AccendingDecending {
	static void sort(int ar[])
	{
		int index=0;
		int l=ar.length;
		int mid=l/2;
		
		int newar[]=new int[l];
		newar[0]=ar[0];
		newar[l-1]=ar[l-1];
		newar[mid+1]=ar[mid+1];
		for(int i=1;i<mid;i++)
		{
			for(int j=1;j<mid;j++) {
				if(ar[i]>ar[j])
				{
					int temp=ar[i];
					ar[i]=ar[j];
					ar[j]=temp;
				}	
			}
			for(int i1=mid+1;i1<l-1;i1++)
			{
				for(int j=mid+1;j<l-1;j++) {
					if(ar[i1]<ar[j])
					{
						int temp=ar[i1];
						ar[i1]=ar[j];
						ar[j]=temp;
					}	
				}
			}
		}
		
	}

	public static void main(String[] args) {

		int ar[]= {1,7,8,5,6,9,7,8,2,4,9,6,3};
		System.out.println("Before sort :");
		System.out.println(Arrays.toString(ar));
		sort(ar);
		System.out.println("After sort :");
		System.out.println(Arrays.toString(ar));
	}

}
