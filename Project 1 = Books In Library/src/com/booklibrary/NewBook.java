package com.booklibrary;

import java.util.Scanner;

public class NewBook {
	static Scanner sc = new Scanner(System.in);
	

	public static void main(String[] args) {
		MethodsImplementation m=new MethodsImplementation();
		NewBook b=new NewBook();
		int ch;
		do {
			System.out.println("");
			System.out.println("=+=+=+=+=+=+ Menu =+=+=+=+=+=+");
			System.out.println("");
			System.out.println("1 Add Book");
			System.out.println("2 Show All Books");
			System.out.println("3 Delete Book");
			System.out.println("4 Update Book");
			System.out.println("5 Search Book");
			System.out.println("6 exit");
			System.out.println("");
			System.out.println("Enter your choice");
			ch = sc.nextInt();

			switch (ch) {
			case 1:
				m.addBook();
				break;
			case 2:
				m.showAllBook();
				break;
			case 3:
				m.deleteBook();
				break;
			case 4:
				m.updateBook();
				break;
			case 5:
				m.searchBook();
				break;
			case 6:
				m.exit();
				break;
			default:
				System.out.println("You Entered Wrong Choice...Try again");
			}
		} while (true);

	}

}
