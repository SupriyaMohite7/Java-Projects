package com.pattern;

public class P4 {

	public static void show(int row)
	{
		{
			for(int i=row;i>=1;i--)
			{
				for(int k=i;k<=row;k++)
				{
					System.out.print(" ");
				}
				for(int j=i;j>=1;j--)
				{
					System.out.print(" * ");
				}
				System.out.println();
			}
		}
	}
	public static void main(String[] args) {

		show(4);
	}

}
