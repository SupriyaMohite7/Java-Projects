package com.basic2;

import java.io.File;
import java.io.FileInputStream;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;


public class DeserializedForm {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		File f=new File("D:\\File Handling/third.ser");
		FileInputStream fos=new FileInputStream(f);
		
		ObjectInputStream ois=new ObjectInputStream(fos);
	
		
		ArrayList<Employee> al=(ArrayList<Employee>)ois.readObject();
		System.out.println(al);
		ois.close();
	}

}
