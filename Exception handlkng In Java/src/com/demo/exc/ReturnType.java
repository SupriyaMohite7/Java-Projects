package com.demo.exc;

public class ReturnType {
	
	static int method1(int data)
	{
		try
		{
			return 30/data;
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		return 0;
	}
	
	static int method2(int data)
	{
		try
		{
			return 30/data;
		}
		catch(Exception e)
		{
			System.out.println(e);
			return -1;
		}
		
//		return -1;
		
	}
	
	@SuppressWarnings("finally")
	static int method3(int data)
	{
		try
		{
			return 30/data;
		}
		catch(Exception e)
		{
			System.out.println(e);
			return -1;
		}
		finally
		{
			return 0;
		}

	//	return -1;
		
	}
	
	public static void main(String[] args) {
		
		System.out.println(method1(9));
		System.out.println(method1(0));
		
		System.out.println("---------------------------------");
		
		System.out.println(method2(4));
		System.out.println(method2(0));
		

		System.out.println("---------------------------------");
		
		System.out.println(method3(4));
		System.out.println(method3(0));
	}

}
