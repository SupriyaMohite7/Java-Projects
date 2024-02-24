package com.objectclass;
class cust
{
	int custid;
	String custname;
	public void set(int cid,String cname)
	{
		custid=cid;
		custname=cname;
	}
	void show()
	{
		System.out.println("id :"+custid);
		System.out.println("name :"+custname);
		System.out.println("---------------");
	}
}
public class Custemer {

	public static void main(String[] args) {
		
	cust c1=new cust();
	cust c2=new cust();
	c1.set(1, "ABC");
	c2.set(2, "DEF");
	c1.show();
	c2.show();
	}

}
