package com.inheritance1;

public class CheckAcess2 extends CheckAcess{

	public static void main(String[] args) {
		
		CheckAcess2 c2=new CheckAcess2();
	//	c2.a=10;
		c2.b=20;
		c2.c=30;
		c2.d=40;

		// private member is not acessible in different class within 
		//same package
		
	}

}
