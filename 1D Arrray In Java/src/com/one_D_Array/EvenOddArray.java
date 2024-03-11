package com.one_D_Array;

import java.util.Scanner;

public class EvenOddArray {

	public static void evenOddArray(int[] arr)
	{
		int evenarr[]=new int[arr.length];
		int oddarr[]=new int[arr.length];
		int indexeven=0,indexodd=0;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]%2==0) {
				evenarr[indexeven]=arr[i];
			indexeven++;}
			else {
				oddarr[indexodd]=arr[i];
			indexodd++;}
		}			System.out.println("Even Array :\n");

		for(int i=0;i<arr.length;i++)
		{
		System.out.print(evenarr[i]+" ");
		}
		System.out.println("\n odd Array : \n");

		for(int i=0;i<arr.length;i++)
		{
		System.out.print(oddarr[i]+" ");
		}
		
	}
	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter size of array :");
		int size=sc.nextInt();
		int arr[]=new int[size];
		for(int i=0;i<size;i++)
		{
			System.out.println("Enter element : ");
			arr[i]=sc.nextInt();
		}
		evenOddArray(arr);
		
		
		
	}

}
