/*
 * Write a Java program to create an abstract class BankAccount with 
 * abstract methods deposit() 
and withdraw().
Create subclasses: SavingsAccount and CurrentAccount that extend the 
BankAccount class 
and implement the respective methods to handle deposits and withdrawals 
for each account type.
 */
package com.abstractclass;

//Abstract class BankAccount
abstract class BankAccount {
 protected double initialBalance;

 public BankAccount(double initialBalance) {
     this.initialBalance = initialBalance;
 }

 // Abstract methods
 public abstract void deposit(double amount);

 public abstract void withdraw(double amount);

 public double getBalance() {
     return initialBalance;
 }
}

//Subclass SavingsAccount
class SavingsAccount extends BankAccount {
 private double interestRate;

 public SavingsAccount(double initialBalance, double interestRate) {
     super(initialBalance);
     this.interestRate = interestRate;
 }

 @Override
 public void deposit(double amount) {
	 initialBalance += amount + (amount * interestRate);
     System.out.println("Deposit successful. New balance: " + initialBalance);
 }

 @Override
 public void withdraw(double amount) {
     if (amount <= initialBalance) {
    	 initialBalance -= amount;
         System.out.println("Withdrawal successful. New balance: " + initialBalance);
     } else {
         System.out.println("Insufficient funds.");
     }
 }
}

//Subclass CurrentAccount
class CurrentAccount extends BankAccount {
 private double overdraftLimit;

 public CurrentAccount(double initialBalance, double overdraftLimit) {
     super(initialBalance);
     this.overdraftLimit = overdraftLimit;
 }

 @Override
 public void deposit(double amount) {
	 initialBalance += amount;
     System.out.println("Deposit successful. New balance: " + initialBalance);
 }

 @Override
 public void withdraw(double amount) {
     if (amount <= initialBalance + overdraftLimit) {
    	 initialBalance -= amount;
         System.out.println("Withdrawal successful. New balance: " + initialBalance);
     } else {
         System.out.println("Exceeded overdraft limit. Withdrawal not allowed.");
     }
 }
}

//Main class to test the implementation
public class BankAccountDemo {
 public static void main(String[] args) {
     // Testing SavingsAccount
     SavingsAccount savingsAccount = new SavingsAccount(1000, 0.05);
     savingsAccount.deposit(500);
     savingsAccount.withdraw(200);

     // Testing CurrentAccount
     CurrentAccount currentAccount = new CurrentAccount(2000, 500);
     currentAccount.deposit(800);
     currentAccount.withdraw(2500);
 }
}
