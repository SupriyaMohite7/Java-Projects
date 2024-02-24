package com.objectclass;

public class Book {

	//instance variable
	int id;
	String name;
	//instance method
	public void text()
	{
		System.out.println("BOOK");
	}
	public static void main(String[] args) {

		Book b1=new Book();
		System.out.println(b1.id);
		System.out.println(b1.name);
		b1.text();
	}

}
// instance variable means no static keyword to variable and method
// it can be acess into main method by using object only
// if method is static method then there is no need to create object we 
//can directly access into main method as main is also static method