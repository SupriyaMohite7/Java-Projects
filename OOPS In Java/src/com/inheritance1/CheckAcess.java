package com.inheritance1;

public class CheckAcess {

	private int a;
	int b;
	protected int c;
	public int d;
	public static void main(String[] args) {

		CheckAcess c=new CheckAcess();
		c.a=10;
		c.b=20;
		c.c=30;
		c.d=40;
		//All members are acessible within same class
	}

}
