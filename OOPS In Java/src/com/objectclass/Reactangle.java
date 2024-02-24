package com.objectclass;

public class Reactangle {

	double length, breath, area, perimeter;

	public void setdata(double l, double b) {
		length = l;
		breath = b;
	}

	public void area() {
		area = length * breath;
	}

	public void perimeter() {
		perimeter = 2 * (length + breath);
	}

	public void display() {
		System.out.println("length :" + length);
		System.out.println("breath :" + breath);
		System.out.println("Area : " + area);
		System.out.println("Perimeter : " + perimeter);
	}
}
