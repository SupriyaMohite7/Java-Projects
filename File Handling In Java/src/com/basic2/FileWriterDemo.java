package com.basic2;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileWriterDemo {

	public static void main(String[] args) throws IOException {
		File f=new File("D:\\File Handling/second.txt");
		boolean b=f.createNewFile();
		if(b)
		{
			System.out.println("new File created");
		}
		FileWriter w=new FileWriter("D:\\File Handling/second.txt",true);
		
		int x;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter String");
		String s=sc.nextLine();
		w.write(s);
		
		
		System.out.println("file written succesfully");
		w.close();
		
		FileReader r=new FileReader("D:\\File Handling/second.txt");
		while((x=r.read())!=-1)
		{
			System.out.print((char)x);
		}
		

	}

}
