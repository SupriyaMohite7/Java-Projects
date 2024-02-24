package com.ForLoop;

public class Add1 {

	 public static int divideby10()
	{
		int value = 0;
		for(int i=10;i<=100;i++)
		{
			if(i%10==0) {
				System.out.println(" "+i);	
			}
			
		}
		return value;
	}
	public static void main(String[] args) {

	divideby10();
	}

}
