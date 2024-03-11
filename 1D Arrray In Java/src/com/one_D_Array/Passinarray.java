package com.one_D_Array;

import java.util.Arrays;

public class Passinarray {

	static int sum=0;
	static void squareElements(int ar[])
	{
		for(int i=0;i<ar.length;i++)
		{
			ar[i]=ar[i]*ar[i];
		}
		System.out.println(Arrays.toString(ar));
	}
	static void sumElements(int a[])
	{
		for(int i=0;i<a.length;i++)
		{
			sum=sum+a[i];
		}
		System.out.println("Addition is : "+sum);	
	}
	public static void main(String[] args) {

		int arr[]= {4,6,5,7,2};
		System.out.println(Arrays.toString(arr));
		squareElements(arr);
		Passinarray pa=new Passinarray();
		int a1[]= {1,2,3,4};
		
		pa.sumElements(a1);
	}

}
