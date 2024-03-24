package com.booklibrary;

import java.util.Scanner;

public class MethodsImplementation implements BookInterface{

	Book_Demo_pojo[] bd=new Book_Demo_pojo[5];
	private int id,cost,count=0;
	private String B_name,Author_name;
	
	Scanner sc=new Scanner(System.in);
	@Override
	public void addBook() {

		System.out.println("Add Book");
		System.out.println("Enter number of books");
		int size = sc.nextInt();
		for (int i = 0; i < size; i++) {

			System.out.println("Enter Book Id :");
			id = sc.nextInt();
			System.out.println("Enter Book Name :");
			B_name = sc.next();
			System.out.println("Enter Book Cost :");
			cost = sc.nextInt();
			System.out.println("Enter Book Author :");
			Author_name = sc.next();
			bd[count]=new Book_Demo_pojo(id,B_name,cost,Author_name);
			count++;
		}	
	}

	@Override
	public void searchBook() {
		System.out.println("Enter Book Id which you want to search :");
		int s_id=sc.nextInt();
			   for(int i=0;i<count;i++)
			   {

				   if(bd[i]!=null && bd[i].getId()==s_id)
				   {
					   System.out.println(bd[i]);
				   }
			   }
			   System.out.println("Succesfully searched.");

		
	}
		
	

	@Override
	public void deleteBook() {
		System.out.println("Enter Book Id which you want to delete :");
		int d_id=sc.nextInt();
			   for(int i=0;i<count;i++)
			   {

				   if(bd[i]!=null && bd[i].getId()==d_id)
				   {
					   bd[i]=null;
				   }
			   }
			   System.out.println("Succesfully Deleted.");

		
	}

	@Override
	public void updateBook() {

		System.out.println("Enter Book Id which you want to update :");
		int u_id=sc.nextInt();
		   for(int i=0;i<count;i++)
		   {

			   if(bd[i]!=null && bd[i].getId()==u_id)
			   {
					  System.out.println("Enter price you want to update");
					  int price=sc.nextInt();
					  bd[i].setCost(price);
					   System.out.println("Succesfully updated.");

			   }
			   else
			   {
				   System.out.println("Book Not found");
			   }
		   }

	}

	@Override
	public void showAllBook() {
		
for(int i=0;i<count;i++)
{
	if(bd[i]!=null) {
	System.out.println(bd[i]);
}
}
	}

	@Override
	public void exit() {

		System.exit(0);
	}

}
