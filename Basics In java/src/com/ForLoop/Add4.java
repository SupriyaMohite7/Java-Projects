package com.ForLoop;

public class Add4 {

	public static void main(String[] args) {

		int ans=0;
		for(int i=1;i<=10;i++)
		{
			if(i%2==0)
			{
				ans=-2*i;
			}
			else
			{
				ans=2*i;
			}
			System.out.println(ans);
		}
	}

}
