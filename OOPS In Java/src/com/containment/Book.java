package com.containment;

public class Book {

	int Book_id;
	String Book_name;
	double price;
	Author author;
	Book()
	{
		
	}
	Book(int Book_id,String Book_name,double price,Author author)
	{
		this.Book_id=Book_id;
		this.Book_name=Book_name;
		this.price=price;
		this.author=author;
		
	}
	public void setBook_id(int Book_id)
	{
		this.Book_id=Book_id;
	}
	public int getBook_id()
	{
		return Book_id;
	}
	public void setBook_name(String Book_name)
	{
		this.Book_name=Book_name;
	}
	public String getBook_name()
	{
		return Book_name;
	}
	public String toString()
	{
		return " book id : "+Book_id+" book name : "+Book_name+
				"book price : "+price+ " athor id : "+author.Author_id+
				"author name : "+author.Author_name+"...";
	}
	public static void main(String[] args) {
		
		Book b1=new Book(1,"java",100.0,new Author(101,"ABCD"));
System.out.println(b1);
	}

}
