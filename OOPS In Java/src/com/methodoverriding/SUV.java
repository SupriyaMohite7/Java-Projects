/*
 * Task2>
A vehicle has four wheels and a color assigned to it.
 A car is a vehicle with a seating capacity of four.
 An SUV is a car which has a 800 horsepower engine. 
 Create a model detailing the same.

*/
package com.methodoverriding;

class Vehicle {
	int no_of_wheels;
	String clr;

	Vehicle() {

	}

	public Vehicle(int no_of_wheels, String clr) {
		super();
		this.no_of_wheels = no_of_wheels;
		this.clr = clr;
	}

	public int getNo_of_wheels() {
		return no_of_wheels;
	}

	public void setNo_of_wheels(int no_of_wheels) {
		this.no_of_wheels = no_of_wheels;
	}

	public String getClr() {
		return clr;
	}

	public void setClr(String clr) {
		this.clr = clr;
	}

	public String toString() {
		return "Vehicle [no_of_wheels=" + no_of_wheels + ", clr=" + clr + "]";
	}

}

class Car extends Vehicle {
	int seat_capacity;

	public Car(int no_of_wheels, String clr, int seat_capacity) {
		super(no_of_wheels, clr);
		this.seat_capacity = seat_capacity;
	}

	public int getSeat_capacity() {
		return seat_capacity;
	}

	public void setSeat_capacity(int seat_capacity) {
		this.seat_capacity = seat_capacity;
	}

	@Override
	public String toString() {
		return "Car [seat_capacity=" + seat_capacity + ", no_of_wheels=" + no_of_wheels + ", clr=" + clr + "]";
	}
	

}

class SUV extends Car {
	int hp;

	public SUV(int no_of_wheels, String clr, int seat_capacity, int hp) {
		super(no_of_wheels, clr, seat_capacity);
		this.hp = hp;
	}

	public int getHp() {
		return hp;
	}

	public void setHp(int hp) {
		this.hp = hp;
	}

	@Override
	public String toString() {
		
		return super.toString()+" SUV hp=" + hp ;
	}

	public static void main(String[] args) {

		SUV s1 = new SUV(4, "red", 4, 800);
		System.out.println(s1);
	}

}
