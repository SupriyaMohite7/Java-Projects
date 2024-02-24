package com.inheritance2;

import com.inheritance1.CheckAcess;

public class CheckAcess3 extends CheckAcess{

	public static void main(String[] args) {

		CheckAcess3 c3=new CheckAcess3();
	//	c3.a=10;
	//	c3.b=20;
		c3.c=30;
		c3.d=40;
		
		// protected and public is acessible and private and default
		//is not acessible within different package.
	}

}
