package com.methodoverriding;

class shape
{

	public void area(int side)
	{
		System.out.println("Area of square  : "+(side*side));
	}
	protected void area(int l,int b)
	{
		System.out.println("Area of reactangle  : "+(l*b));
	}
/*	private void area(float radius)
	{
		System.out.println("Area of circle  : "+(3.14*radius*radius));
	}*/
	// we cannot acess private method
	public void area(float radius)
	{
		System.out.println("Area of circle  : "+(3.14*radius*radius));
	}
}
public class Area {

	public static void main(String[] args) {

		shape a1=new shape();
		a1.area(3.4f);
		a1.area(4);
		a1.area(7, 8);
	}

}
