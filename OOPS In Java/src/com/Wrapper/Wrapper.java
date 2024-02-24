package com.Wrapper;

public class Wrapper {

	public static void main(String[] args) {

		System.out.println("Boxing = Primitive data type to Wrapper class");
		int n=23;
		Integer i=Integer.valueOf(n);
		Integer i1=n;	//valueOf is directly added by compiler = autoboxing
	//	Integer i2=new Integer(); old type method now deprecated
		System.out.println(i);
		System.out.println(i1);
		System.out.println("Un-Boxing =  Wrapper class to Primitive data type ");
		Float F=8.45F;
		float f=F.floatValue();
		float f1=F; //floatvalue is directly added by compiler = autounboxing
		System.out.println(f);
		System.out.println(f1);
	}

}
