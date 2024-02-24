/*
 * 
Task1>
A bank has a principal amount and a rate of interest which is 2%. 
A savings account has a rate of interest 3% while a current account has 5%. 
Write a method that displays the rate of interest based on whether 
the account is default/ savings/ current
 */
package com.methodoverriding;

class Bank {
	int principal_amount, rate_of_interst;

	public Bank() {
		System.out.println("BANK");
	}

	public Bank(int principal_amount, int rate_of_interst) {
		this.principal_amount = principal_amount;
		this.rate_of_interst = rate_of_interst;
	}
	public int getPrincipal_amount() {
		return principal_amount;
	}

	public void setPrincipal_amount(int principal_amount) {
		this.principal_amount = principal_amount;
	}

	public int getRate_of_interst() {
		return rate_of_interst;
	}

	public void setRate_of_interst(int rate_of_interst) {
		this.rate_of_interst = rate_of_interst;
	}
	void display()
	{
		System.out.println("Rate Of Interst Of  Account :"+rate_of_interst+"%");
	}
}

class Saving_account extends Bank {

	public Saving_account() {

	}

	public Saving_account(int principal_amount, int rate_of_interst) {
		super(principal_amount,rate_of_interst);
	}

	public int getPrincipal_amount() {
		return principal_amount;
	}

	public void setPrincipal_amount(int principal_amount) {
		this.principal_amount = principal_amount;
	}

	public int getRate_of_interst() {
		return rate_of_interst;
	}

	public void setRate_of_interst(int rate_of_interst) {
		this.rate_of_interst = rate_of_interst;
	}
	@Override
	void display()
	{
		System.out.println("Rate Of Interst Of Saving Account :"+rate_of_interst+"%");
	}
}

class Current_account extends Bank {

	public Current_account() {

	}

	public Current_account(int principal_amount, int rate_of_interst) {
		super(principal_amount,rate_of_interst);
	}

	public int getPrincipal_amount() {
		return principal_amount;
	}

	public void setPrincipal_amount(int principal_amount) {
		this.principal_amount = principal_amount;
	}

	public int getRate_of_interst() {
		return rate_of_interst;
	}

	public void setRate_of_interst(int rate_of_interst) {
		this.rate_of_interst = rate_of_interst;
	}
	void display()
	{
		System.out.println("Rate Of Interst Of Current Account :"+rate_of_interst+"%");
	}
}

public class Bank_Interest {

	public static void main(String[] args) {
		Bank b=new Bank();
		b.setRate_of_interst(2);
		b.display();
		Current_account ca = new Current_account();
		ca.setRate_of_interst(5);
		ca.display();
		Saving_account sa = new Saving_account();
		sa.setRate_of_interst(3);
		sa.display();
	}

}
