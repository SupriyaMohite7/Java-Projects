package com.one_D_Array;

import java.util.Scanner;

public class SquareCube {
	public static void square(int[] arr)
	{
		for(int i=0;i<=arr.length-1;i++)
			
		{
			arr[i]=arr[i]*arr[i];
		}
	}
	public static void cube(int[] arr)
	{
for(int i=0;i<=arr.length-1;i++)
			
		{
			arr[i]=arr[i]*arr[i]*arr[i];
		}
	}
public static void display(int[] arr)
{
	for(int i=0;i<=arr.length-1;i++)
		
	{
		System.out.println(arr[i]);
	}
}
	public static void main(String[] args) {

		int arr[]= {1,2,3,4,5,6,7,8,9};
		Scanner sc=new Scanner(System.in);
	
		System.out.println("What do you want ? \n if you want "
				+ "square press 2 \n if you want cube press 3 ");
		int ch=sc.nextInt();
		switch(ch)
		{
		case 2 :
			square(arr);
			display(arr);
			break;
		case 3 :
			cube(arr);
			display(arr);
			break;
		default :
			System.out.println("wrong choice");
		}
	}

}
