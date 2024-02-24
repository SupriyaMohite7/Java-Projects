/* Task1: Create a class Book with the following details : id, name , 
 * price, category
Create  methods to calDiscount(), compareDiscCost() 
Create 4 objects of books by taking the user input and then 
compare the cost of any 2 books
*/
package com.statickeyword;

import java.util.Scanner;

public class Book {

	Scanner sc = new Scanner(System.in);
	int id;
	int price;
	String name;
	String category;
	double discountprice, save;

	Book() {

	}

	Book(int id, int price, String name, String category) {
		this.id = id;
		this.price = price;
		this.name = name;
		this.category = category;
	}

	static {
		System.out.println("=============Book Store=============");
	}
	{
		System.out.println("New User...New Book...\n");
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getId() {
		return id;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getPrice() {
		return price;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public String getCategory() {
		return category;
	}

	public double calDiscount() {
		int discount = 15;
		discountprice = (price * 15) / 100;
		return discountprice;
	}

	double compareDiscCost() {
		save = price - discountprice;
		return save;
	}

	void userInput() {
		System.out.println("Enter Book Id : ");
		id = sc.nextInt();
		System.out.println("Enter Book Name : ");
		name = sc.next();
		System.out.println("Enter Book Price : ");
		price = sc.nextInt();
		System.out.println("Enter Book category : ");
		category = sc.next();
	}

	void display() {
		System.out.println("\n Book Id : " + id + "\n Book Name : " + name + "\n Book Price : " + price
				+ "\n Book category : " + category + "\n Your savings : " + discountprice + "\n Final Amount : " + save
				+ "\n ---------------------------------\n");
	}

	void compare(Book b1, Book b2) {
		if (b1.save > b2.save) {
			System.out.println(b1.name + " is more costly than " + b2.name);
		} else if (b2.save > b1.save) {
			System.out.println(b2.name + " is more costly than " + b1.name);
		} else {
			System.out.println(b1.name + " and " + b2.name + " both have same price");
		}
	}

	public static void main(String[] args) {

		Book b1=new Book();
		b1.userInput();
		Book b2=new Book();
		b2.userInput();
		b1.calDiscount();
		b2.calDiscount();
		b1.compareDiscCost();
		b2.compareDiscCost();
		b1.compare(b1, b2);
		
		
		for (int i = 1; i <= 4; i++) {
			Book bi = new Book();
			bi.userInput();
			bi.calDiscount();
			bi.compareDiscCost();
			bi.display();

		}
		
		
		

	}

}
