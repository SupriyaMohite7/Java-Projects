/*4>Write a Java program to create Product class as per below details
Data member : proId,name,description,price,quantity and discount
methods : displayProduct,calculateTotalPrice(),calculateDiscountPrice()

*/
package com.constructor2;

class product_info {
	int proId, discount, quantity;
	String name, description;
	float price, total_price;
	double price_with_discount;

	product_info() {

	}

	product_info(int proId, String name) {
		this.proId = proId;
		this.name = name;
	}
	public void setPrice(float price) {
		this.price = price;
	}

	public float getPrice() {
		return price;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getDescription() {
		return description;
	}

	float calculateTotalPrice() {
		total_price = quantity * price;
		return total_price;
	}

	double calculateDiscountPrice() {
		price_with_discount = total_price-(0.10 * total_price);
		
		return price_with_discount;
	}

	void displayProduct() {
		System.out.println("\n product Id :" + proId + "\n Name :" + name + "\n Description :" + description
				+ "\n Price :" + price + "\n Quantity :" + quantity + "\n Total price :" + total_price
				+ "\n Price After Discount(10%) : " + price_with_discount + "\n =======================================");

	}
}

public class Product {

	public static void main(String[] args) {
		product_info p1 = new product_info();
		product_info p2 = new product_info(1, "ABC");
		p2.setPrice(5);
		p2.setQuantity(50);
		p2.setDescription("abcd");
		p2.calculateTotalPrice();
		p2.calculateDiscountPrice();
		p2.displayProduct();
	}

}
