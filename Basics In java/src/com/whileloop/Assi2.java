//WAP to print odd numbers from 521 to 229 using while loop. 
package com.demo.whileloop;

public class Assi2 {

	public static void check() {
		int i=521;
		while(i>=229)
		{
			int flag=0;
			if(!(i%2==0))
			{
		//	System.out.println(i);
			flag=1;
			}
			if (flag==1)
			{
				System.out.println(i);
			}
			i--;
		}
	}
	
	public static void main(String[] args) {

		check();
	}

}
