package com.one_D_Array;

import java.util.Arrays;

public class Second_highest {

	static int findsecondhighest(int ar[])
	{
		int h=Integer.MIN_VALUE;//ar[0]
		int sh=Integer.MIN_VALUE;
		
		for(int x:ar)
		{
			if(x>h)
			{
				sh=h;
				h=x;
			}
			else if(x>sh)
			{
				sh=x;
			}
		}
		return sh;
	}
	public static void main(String[] args) {

		int arr[]= {5,7,9,6,4,8,2};
		System.out.println(Arrays.toString(arr));
		int sh=findsecondhighest(arr);
		System.out.println("Second Highest : "+sh);
	}

}
