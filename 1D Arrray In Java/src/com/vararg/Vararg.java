package com.vararg;

public class Vararg {
	 static void sum(int[] a) {
		 int sum=0;
		for(int x: a)
		{
			sum+=x;
		}
		  System.out.println(" Sum : "+sum);

	}
	  static void new_sum(int ...ar) {  //ellipns ...
		  int sum=0;
for(int x:ar)
{
	sum+=x;
}
		  System.out.println(" Sum : "+sum);
		}
	public static void main(String[] args) {

		int a1[]= {1,2,3};
		int a2[]= {4,5,6};
		sum(a1);
		sum(a2);
		
		System.out.println("-------------------------------------");
		new_sum(1,4,7);
		new_sum(2,5);
		new_sum(3,2,1,4,5);
	}
	

	

}
