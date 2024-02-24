package com.Interface;
interface movable
{
void move();

}
interface printable extends movable
{
	void display();
}
class Printer implements printable
{

	@Override
	public void move() {
		System.out.println("Printer :move");
		
	}

	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("Printer :display");
	}
	
}
class car implements movable
{

	@Override
	public void move() {
		System.out.println("Car :move");

	}
	
}
public class Interface_demo2 {

	public static void main(String[] args) {

		movable m;
	//	printable p;
		m=new car();
		m.move();
		m=new Printer();
		m.move();
		printable p;
		p=new Printer();
		p.move();
		p.display();
		
	}

}
