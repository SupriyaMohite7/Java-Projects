/*
 * 
 * Task2: Create a library of books , Count the number of books added 
 * in the library. All the books have a common supplier "Mr XYZ" 
Show the details of library as:
Supplier name:
Total books:
Book details
*
 */
package com.statickeyword;

import java.util.Scanner;

public class Library {

	int id;
	String name;
	Scanner sc = new Scanner(System.in);
	private static int count;
	static String supp_name = "Mr.XYZ";
	static
	{
		System.out.println("====Details of Library====");
	}
	{
		count++;
	}
	Library()
	{
		
	}
	public void setId(int id) {
		this.id = id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void bookDetails(Library l) {
		System.out.println("Enter book Id");
		l.setId(sc.nextInt());
		System.out.println("Enter book name");
		l.setName(sc.next());
	}
	public static void show()
	{
		System.out.println("\n Supplier name : "+supp_name+ 
				"\n Total books : "+count+"\n Book details ");
	}
	public void display()
	{
		System.out.println(id+"\t"+name);
	}

	public static void main(String[] args) {
		
		Library l1 = new Library();
		l1.bookDetails(l1);
		Library l2 = new Library();
		l2.bookDetails(l2);
		l1.show();
		System.out.println("");
		l1.display();
		l2.display();
/*
		System.out.println("\n Supplier name : "+supp_name+ 
				"\n Total books : "+count+
				"\n Book details\n"+l1.id+"\t"+l1.name+"\n"+l2.id+"\t"+l2.name);
	*/	
	}

}
