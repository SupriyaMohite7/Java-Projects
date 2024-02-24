package com.demo.nestedLoops;
import java.util.Scanner;

/*
 * Write Java Program to Display the ATM Transaction.
The user will choose from any one of the available options as input. 
Different cases using switch case have been provided for different operations like withdraw, deposit and check balance.
Use do while loop for multiple transaction

Hint: you can set initial pin and balance in ur code
After entering correct pin user should able to do transaction
Options

1.Withdraw
2.Deposit
3.check balance
4.Currency Nomination
 */
public class BankAccount {

	static Scanner sc = new Scanner(System.in);
	static int bal_account = 5000;

	public static void withdraw() {
		System.out.println("Enter Amount that you want :");
		int withdraw = sc.nextInt();
		if (withdraw <= bal_account) {
			System.out.println("Amount withdraw : " + withdraw);
			bal_account = bal_account - withdraw;
			System.out.println("Balence : " + bal_account);
		} else {
			System.out.println("Insufficient Balence");
		}
	}

	public static void deposit() {
		System.out.println("Enter Amount that you want to deposit :");
		int deposit = sc.nextInt();

		bal_account = bal_account + deposit;
		System.out.println("Balence : " + bal_account);

	}
	public static void check_bal()
	{
		System.out.println("Balence : " + bal_account);
	}

	public static void main(String[] args) {

		int pin;
		System.out.println("------Welcome to HDFC bank------");
		System.out.println("Enter Username : ");
		String username = sc.nextLine();
		
		do {
			System.out.println("Enter PIN : ");
			pin = sc.nextInt();
			if (pin == 1234) {
				System.out.println("Welcome " + username + " You are able to do transaction");

				System.out.println("\n Options \n" + "1.Withdraw\n" + "2.Deposit\n" + "3.check balance\n"
						+ "4.Currency Nomination \n 5. exit");
				System.out.println("\n Enter your choice :");
				int ch = sc.nextInt();
				switch (ch) {
				case 1: {
					withdraw();
					break;
				}
				case 2: {
					deposit();
					break;
				}
				case 3: {
					check_bal();
					break;
				}
				case 4: {
					break;
				}
				case 5 :
				{
					System.exit(0);
					
				}
				default:
					System.out.println("Option not available");
				}
			} else {
				System.out.println("You entered wrong pin");
			}
		} while (true);

	}
}
