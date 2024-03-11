package com.vararg;

public class VaragOverLoadingWrapper {


static void show(Object ...a)
{
	System.out.println("In wrapper Object");
	for(Object x:a)
	{
		System.out.println(x);
	}
}

static void show(Number ...a)
{
	System.out.println("In wrapper Integer");
	for(Number x:a)
	{
		System.out.println(x);
	}
}

static void show(Double ...a)
{
	System.out.println("In wrapper double");
	for(Double x:a)
	{
		System.out.println(x);
	}
	
}/*
static void show(Character ...a)
{
	System.out.println("In wrapper Character");
	for(Character x:a)
	{
		System.out.println(x);
	}
	
}*/
	public static void main(String[] args) {

		show(1,8,9,7);
		show(1.2,3.4,7.5);// object is a parent class of all data type
		show('a','v','h');
	}

}
