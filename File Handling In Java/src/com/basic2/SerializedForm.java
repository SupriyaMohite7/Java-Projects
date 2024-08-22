package com.basic2;

import java.io.File;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class SerializedForm {

	public static void main(String[] args) throws IOException {
		
		File f=new File("D:\\File Handling/third.ser");
		FileOutputStream fos=new FileOutputStream(f);
		
		ObjectOutputStream oos=new ObjectOutputStream(fos);
		
		
		ArrayList<Employee> al=new ArrayList<Employee>();
		Employee e1=new Employee(1,"priti",15000,1234);
		Employee e2=new Employee(2,"prachi",28000,12345);
		al.add(e1);
		al.add(e2);
		Employee e3=new Employee(3,"prajakta",5000,12345);
		Employee e4=new Employee(4,"priyanka",17000,12345);
		al.add(e3);
		al.add(e4);
		oos.writeObject(al);
		
		
		
		System.out.println("Data written succesfully");
		oos.close();

	}

}
