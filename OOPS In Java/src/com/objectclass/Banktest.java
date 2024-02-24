package com.objectclass;

public class Banktest {

	public static void main(String[] args) {
		
		Bank b1= new Bank();
		b1.setData(1, "priya", 5000);
		b1.display();
	//	b1.bal();	// we can not acess variables from compilable class
					// as we declare it private
					//so now define getter and setter method in 
					// compliable class
					// and call in this executable class
		b1.setAcc_no(2);
		b1.getAcc_no();
		b1.display();
		
		b1.set_bal(2000);
		b1.set_name("ravi");
		b1.display();
	}

}
