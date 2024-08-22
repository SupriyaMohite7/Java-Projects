package com.demo.exc;

public class TryFinally {
	
	public static void main(String[] args) {
		
		try
		{
			int a=10;
			System.out.println(a/0);
		}
		catch (Exception e) {
			System.out.println(e);
		}
		finally
		{
			System.out.println("Finally block...");
		}

		System.out.println("Rest code");
		// catch - auto generated by JVM - abruptly stop
	}

}