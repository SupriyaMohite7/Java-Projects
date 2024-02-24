/*
 * 13)Create class Box and calculate the volume of box
 volume=length x width x height
 */
package com.class_and_object;

public class Box {

	int length,width,height,volume;
	void volume(int l,int w,int h)
	{
		length=l;
		width=w;
		height=h;
		volume=length*width*height;
	}
	void show()
	{
		System.out.println("Volume is :"+volume);
	}
	public static void main(String[] args) {
		Box b1=new Box();
		b1.volume(5,6,7);
		b1.show();
	}

}
