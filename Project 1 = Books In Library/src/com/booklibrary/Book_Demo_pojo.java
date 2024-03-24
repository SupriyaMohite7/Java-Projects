package com.booklibrary;

import java.util.Scanner;

public class Book_Demo_pojo {
	private int id,cost,count=0;
	private String B_name,Author_name;
	
	Scanner sc=new Scanner(System.in);
	
	public Book_Demo_pojo() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Book_Demo_pojo(int id, String b_name, int cost, String author_name) {
		super();
		this.id = id;
		this.cost = cost;
		B_name = b_name;
		Author_name = author_name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getCost() {
		return cost;
	}
	public void setCost(int cost) {
		this.cost = cost;
	}
	public String getB_name() {
		return B_name;
	}
	public void setB_name(String b_name) {
		B_name = b_name;
	}
	public String getAuthor_name() {
		return Author_name;
	}
	public void setAuthor_name(String author_name) {
		Author_name = author_name;
	}
	@Override
	public String toString() {
		return "Book_Demo [id=" + id + ", cost=" + cost + ", B_name=" + B_name + ", Author_name=" + Author_name + "]";
	}
	

}
