package com.finalkeyword;

final class one
{
	final void show()
	{
		System.out.println("show final method");
	}
}
 class Final_keyword // extends one = error=as one is a final class
 					// so we cannot inherit class one
 {
	final int n=10;// value is constant all over the program.
	int x=20;
	

	public int getX() {
		return x;
	}


	public void setX(int x) {
		this.x = x;
	}

// as we cant change value of int n we cannot write set method to it.
	public int getN() {
		return n;
	}
	/*
@Override		// final methods cannot be overriden
	void show()
{
	System.out.println("show final method");
}
*/
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Final_keyword f=new Final_keyword();
	//	f.show();
		one o=new one();
		o.show();
	}

}
