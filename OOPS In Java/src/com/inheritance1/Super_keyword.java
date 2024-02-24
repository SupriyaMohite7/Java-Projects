package com.inheritance1;

class base {
	int value;

	
	base() 
	{

	}

	base(int value) 
	{
		System.out.println("in base class");
		this.value=value;
	}
}

public class Super_keyword extends base {

	int data;

	Super_keyword() 
	{

	}

	Super_keyword(int data, int value) {
		super(value);
		this.data = data;
	}

	public static void main(String[] args) {
		Super_keyword sk = new Super_keyword(10, 50);
		System.out.println(sk.data);
		System.out.println(sk.value);
	}

}
