/*
 * Task 4>>
Create a code to show how abstract class can have tight coupling issues
 */
package com.coupling;

abstract class Text {
	String abcd;
	abstract void show(String text1);
	public Text(String abcd)
	{
	this.abcd=abcd;	
	}
	void show2()
	{
		
	}
}

class Lesson extends Text {
public Lesson() {
		super("abcd");
	}

//	public Lesson(String newles) {
//		super.text("java");
//	}

	@Override
	public void show(String text1) {
		System.out.println(text1);
	}

}

class Paragraph extends Text {
	public Paragraph() {
		super("java");
	}

	@Override
	public void show(String text1) {
		System.out.println(text1);
	}

}

public class TightCouple {
	public void showString(Text t, String text1) {
		t.show(text1);
		t.show2();
	}

	public static void main(String[] args) {
		TightCouple tc = new TightCouple();
		tc.showString(new Lesson(), "Hello everyone!!!");
		tc.showString(new Paragraph(), "Hello Paragraph!!!");
	
	}

}
