/*Task4>
You have to build a loan calculator.
 If a single rate of interest is provided then it is a housing loan 
and loan is principal amount * (100 + rate) 
If two values are provided then it is a commercial loan 
and loan is principal amount * (value 1 + value 2 +100)
*/
package com.polymorphism;

import java.util.Scanner;

public class Loan {
	double rate, rate1, rate2;
	int principal_amount;
	double finalAmount;

	Loan() {

	}

	Loan(int principal_amount, double rate) {
		this.principal_amount = principal_amount;
		this.rate = rate;
	}

	public double calculateLoan(double rate) {
		finalAmount = principal_amount * (100 + rate);
		return finalAmount;
	}

	public double calculateLoan(double rate1, double rate2) {
		finalAmount = principal_amount * (rate1 + rate2 + 100);
		return finalAmount;

	}

	public void setPrincipal_amount(int principal_amount) {
		this.principal_amount = principal_amount;
	}

	public int getPrincipal_amount() {
		return principal_amount;
	}

	public static void main(String[] args) {
		Loan l1 = new Loan();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Principal Amount : ");
		l1.setPrincipal_amount(sc.nextInt());
		System.out.println("Housing Loan : " + l1.calculateLoan(7.6));
		System.out.println("Commercial Loan : " + l1.calculateLoan(4.5, 6.3));
	}

}
