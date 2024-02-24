package com.constructor;

import java.util.Scanner;

public class Item {

	static Scanner sc=new Scanner(System.in);
	int itemId, qty;
	String iName;
	double price, totalPrice, discountedPrice;

	Item()
	{
		
	}

	Item(int itemId,String iName,int qty,double price)
	{
		this.itemId=itemId;
		this.iName=iName;
		this.qty=qty;
		this.price=price;
	}
	public void setitemId(int itemId)
	{
		this.itemId=itemId;
	}
	public int getitemId()
	{
		return itemId;
	}
	public void setiName(String iName)
	{
		this.iName=iName;
	}
	public String getiName()
	{
		return iName;
	}
	public void setPrice(float price) {
		this.price = price;
	}

	public double getPrice() {
		return price;
	}
	public void setQuantity(int qty) {
		this.qty = qty;
	}

	public int getQuantity() {
		return qty;
	}
	public void productDetails()
	{
		System.out.println("Enter Item Id :");
		itemId=sc.nextInt();
		System.out.println("Enter Item Name :");
		iName=sc.next();
		System.out.println("Enter Item Quantity :");
		qty=sc.nextInt();
		System.out.println("Enter Item Price :");
		price=sc.nextInt();
	}
	double calculateDiscountPrice() {
		discountedPrice = totalPrice-(0.10 * totalPrice);
		
		return discountedPrice;
	}

	void displayProduct() {
		System.out.println("\n product Id :" + itemId + "\n Name :" + iName + "\n Price :" + price + "\n Quantity :" + qty + "\n Total price :" + totalPrice
				+ "\n Price After Discount(10%) : " + discountedPrice + "\n =======================================");

	}
}
