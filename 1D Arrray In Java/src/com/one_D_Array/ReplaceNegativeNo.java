package com.one_D_Array;

public class ReplaceNegativeNo {

	public void replace(int arr[])
	{
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]<0)
			{
				arr[i]=0;
			}System.out.print(arr[i]+" ");

		}	}
	
	public static void main(String[] args) {

		int array[]= {1,6,-7,7,6,-4,2,0};
		for(int i=0;i<array.length;i++)
		{
		System.out.print(array[i]+" ");
		}
		System.out.println("\n ..................\n");
		ReplaceNegativeNo rn=new ReplaceNegativeNo();
		rn.replace(array);
		System.out.println("\n ..................\n");
		for(int i=0;i<array.length;i++)
		{

		System.out.print(array[i]+" ");
		}
	}

}
