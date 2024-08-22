package com.basic;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Scanner1 {

	public static void main(String[] args) throws FileNotFoundException {
		File f=new File("D:\\File Handling/writetext.txt");
		//try-with-resource(ARM)
		try (Scanner sc = new Scanner(f)) {
			while(sc.hasNextLine())
			{
			System.out.println(sc.nextLine());
			}
		}
	

	}

}
