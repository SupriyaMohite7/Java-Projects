package com.Basics;

import java.util.Arrays;

public class Min_CharacterArray {
	public static void find_min(char[] name)
	{
		char min = 0;
		for(int i=0;i<name.length;i++)
		{
			for(int j=i+1;j<name.length;j++)
			{
				if(name[i]<name[j])
				{
					 min=name[i];
				}
			}
		}				System.out.println(" Min Character :"+min);

	}

	public static void main(String[] args) {

		char[] name= {'z','a','v','t','j'};
		System.out.println(Arrays.toString(name));
		find_min(name);
		
	}

}
