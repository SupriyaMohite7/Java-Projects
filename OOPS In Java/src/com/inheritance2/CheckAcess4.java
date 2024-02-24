package com.inheritance2;

import com.inheritance1.CheckAcess;

public class CheckAcess4 {

	public static void main(String[] args) {
		CheckAcess c4=new CheckAcess();
//		c4.a=10;
//		c4.b=20;
//		c4.c=30;
		c4.d=40;
		// only public member is acessible in diffrent package
		// but there is need to create object of that class in 
		//which we declare public variable 

	}

}
