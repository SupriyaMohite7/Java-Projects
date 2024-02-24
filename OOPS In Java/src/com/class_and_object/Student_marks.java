/*
 * create student class assign marks and calculate the percentage and print the result 1st class,2nd 
class etc.

 */
package com.class_and_object;

public class Student_marks {
	private int sub1, sub2, sub3, percent;

	public void setData(int s1, int s2, int s3) {
		sub1 = s1;
		sub2 = s2;
		sub3 = s3;
	}

	public void percentage() {
		percent = (sub1 + sub2 + sub3) / 3;
	}

	public void find_class()
	{
		if(percent>=65)
		{
			System.out.println("First Class");
		}
		else if(percent<65 || percent>=55)
		{
			System.out.println("Higher second Class");
		}
		else if(percent<55 || percent>=45)
		{
			System.out.println("Second Class");
		}
		else if (percent<45)
		{
			System.out.println("Third Class");
		}
		
		
	}
	public void display()
	{
		System.out.println(" Subject 1 :"+sub1);
		System.out.println(" Subject 2 :"+sub2);
		System.out.println(" Subject 3 :"+sub3);
		System.out.println(" Percentage :"+percent);
	}
}
