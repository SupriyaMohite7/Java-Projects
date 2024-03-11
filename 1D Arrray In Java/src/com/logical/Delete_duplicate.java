/*
 * Delete all the duplicate elements from an char array

 */
package com.logical;

import java.util.Arrays;

public class Delete_duplicate {

	static void delete(char[] name)
	{
		int count=0;
		for(int i=0;i<name.length-1;i++)
		{
			for(int j=i+1;j<name.length-1;j++)
			{
				if(name[i]==name[j])
				{
					name[i]=' ';
					name[j]=' ';
				
					
					
				}
			}
			
		}
	}
	public static void main(String[] args) {

		char[] name= {'b','a','t','b','a','l','l','y','e','l','l','o','w'};
		System.out.println(Arrays.toString(name));
		delete(name);
		System.out.println(Arrays.toString(name));

	}

}
