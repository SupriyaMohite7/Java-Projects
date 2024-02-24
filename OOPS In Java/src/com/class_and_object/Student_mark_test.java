/*
 * create student class assign marks and calculate the percentage and print the result 1st class,2nd 
class etc.

 */
package com.class_and_object;

public class Student_mark_test {

	public static void main(String[] args) {
		
		Student_marks sm=new Student_marks();
		sm.setData(80, 70, 90);
		sm.percentage();
		sm.display();
		sm.find_class();
		
	}

}
