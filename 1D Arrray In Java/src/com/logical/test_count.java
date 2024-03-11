package com.logical;

import java.util.Arrays;

public class test_count {
	static void find(int[] a)
	{
	int count=1;
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]==a[j])
				{
					count++;
					
				}
			}			System.out.println(a[i]+" -> "+count);

		}

	}
		public static void main(String args[])
		{
			int[] arr={2,3,5,7,7};
					System.out.println(Arrays.toString(arr));
			find(arr);

		}

	}