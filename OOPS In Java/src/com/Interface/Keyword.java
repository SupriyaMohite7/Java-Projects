/*
 * Task1>> 
Create an example to show the usage of 
default, static and private method in interface
 */
package com.Interface;

interface Example {
	abstract void abstractMethod();

	default void defaultMethod() {
		System.out.println("Default method implementation");
	}

	static void staticMethod() {
		System.out.println("Static method implementation");
	}

	private void privateMethod() {
		System.out.println("Private method implementation");
	}

	default void seconddefaultMethod() {
		privateMethod();
	}
}

class Keyword implements Example {

	@Override
	public void abstractMethod() {
		System.out.println("Abstract method implementation");
	}

	public static void main(String[] args) {

		Example e;
		e = new Keyword();
		e.defaultMethod();
		System.out.println("-----------------------------------");
		e.abstractMethod();
		System.out.println("-----------------------------------");
		Example.staticMethod();
		System.out.println("-----------------------------------");
		e.seconddefaultMethod();
		System.out.println("-----------------------------------");

	}

}
/*
 * //Example interface with default, static, and private methods interface
 * ExampleInterface { // Default method
 * 
 * 
 * // Static method
 * 
 * 
 * // Abstract method (to be implemented by classes that implement the
 * interface)
 * 
 * 
 * // Private method (can only be used within the interface)
 * 
 * // Another default method default void anotherDefaultMethod() {
 * privateMethod(); // Accessing private method within the interface
 * System.out.println("Another default method implementation"); } }
 * 
 * //Implementing class class ExampleClass implements ExampleInterface {
 * 
 * @Override public void abstractMethod() {
 * System.out.println("Abstract method implementation in ExampleClass"); } }
 * 
 * public class InterfaceExample { public static void main(String[] args) { //
 * Creating an instance of the implementing class ExampleClass exampleObj = new
 * ExampleClass();
 * 
 * 
 * 
 * // Using static method ExampleInterface.staticMethod();
 * 
 * // Using abstract method exampleObj.abstractMethod();
 * 
 * // Using another default method exampleObj.anotherDefaultMethod(); } }
 */