package com.shifting;

import java.util.Arrays;

public class ShiftZero {
	
	public static void shift(int ar[])
	{
		int count=0;
		for(int i=0;i<ar.length;i++)
		{
			if(ar[i]!=0)
			{
				ar[count]=ar[i];
				count++;
			}
			
		}while(count<ar.length)
		{
			ar[count++]=0;
		}
	}

	public static void main(String[] args) {

		int ar[]= {5,8,4,7,36,0,4,5,0,5,4,0,6,0,5};
		System.out.println("before shifting :");
		System.out.println(Arrays.toString(ar));
		
		shift(ar);
		
		System.out.println("after shifting :");
		System.out.println(Arrays.toString(ar));
	}

}
