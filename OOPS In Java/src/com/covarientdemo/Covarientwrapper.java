package com.covarientdemo;

class first
{
	Object value;
	Object showvalue()
	{
		value=10;
		return value;
	}
}
class second extends first
{
	Integer myvalue;
	Integer showvalue()
	{
		myvalue=10;
		return myvalue;
	}
}
class third extends first
{
	Character ch;
	Character showvalue()
	{
		ch='a';
		return ch;
	}
}
public class Covarientwrapper {

	public static void main(String[] args) {
	first f1=new first();
	System.out.println(".."+f1.showvalue());
	second s1=new second();
	System.out.println(".."+s1.showvalue());
	third t1=new third();
	System.out.println(".."+t1.showvalue());
	}

}
