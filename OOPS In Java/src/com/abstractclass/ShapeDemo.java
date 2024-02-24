/*
 * Task2>>
Write a Java program to create an abstract class Shape with abstract 
methods calculateArea()
 and calculatePerimeter(). 
Create subclasses Circle and Triangle that extend the Shape class and
 implement the respective methods 
to calculate the area and perimeter of each shape
 */
package com.abstractclass;

abstract class Shape {
	double perimeter, area;

	abstract void calculateArea();
	abstract void calculatePerimeter();
}

class circle extends Shape {

	static int r;

	public int getR() {
		return r;
	}

	public void setR(int r) {
		this.r = r;
	}

	@Override
	void calculateArea() {
		area = 3.14 * r * r;
		System.out.println("Area of circle :" + area);
	}

	@Override
	void calculatePerimeter() {
		perimeter = 2 * 3.14 * r;
		System.out.println("Perimeter of a circle :" + perimeter);
	}

}

class Triangle extends Shape {
	static int base, height, side1, side2, side3;

	public static int getBase() {
		return base;
	}

	public static void setBase(int base) {
		Triangle.base = base;
	}

	public static int getHeight() {
		return height;
	}

	public static void setHeight(int height) {
		Triangle.height = height;
	}

	public static int getSide1() {
		return side1;
	}

	public static void setSide1(int side1) {
		Triangle.side1 = side1;
	}

	public static int getSide2() {
		return side2;
	}

	public static void setSide2(int side2) {
		Triangle.side2 = side2;
	}

	public static int getSide3() {
		return side3;
	}

	public static void setSide3(int side3) {
		Triangle.side3 = side3;
	}

	@Override
	void calculateArea() {
		area = 0.5 * base * height;
		System.out.println("Area of triangle :" + area);
	}

	@Override
	void calculatePerimeter() {
		perimeter = side1 + side2 + side3;
		System.out.println("Perimeter of triangle :" + perimeter);

	}

}

public class ShapeDemo {

	public static void main(String[] args) {
		circle c = new circle();
		c.setR(10);

		Triangle t = new Triangle();
		t.setBase(10);
		t.setHeight(5);
		t.setSide1(7);
		t.setSide2(7);
		t.setSide3(7);

		Shape s;
		s = new circle();
		s.calculateArea();
		s.calculatePerimeter();
		s = new Triangle();
		s.calculateArea();
		s.calculatePerimeter();
	}

}
