/*
 * Task2>>
Create an online shopping which has various modes to paythe Bill
If paid through cash.. no discount
Paytm ... above 1000,, cashback 500
Credit card .. any amount : 20% discount
Debit card.... above 5000 : 20% discount
Try to the pay bill using different modes
 */
package com.Interface;

import java.util.Scanner;

interface discount
{
	public void offer(double amount);
}
class Cash implements discount
{

	@Override
	public void offer(double amount) {
		System.out.println("Your bill amount is : "+amount);		
	}
	public void show()
	{
		System.out.println("..");
	}
	
}
class Paytm implements discount
{

	@Override
	public void offer(double amount) {
		if(amount>=1000)
		{
			System.out.println("Your bill amount is : "+amount+
					"\n So you get rs 500 cashback.\n  Now you have to pay "+(amount-500));
		}
		else
		{
			System.out.println("Your bill amount is : "+amount);
		}
	}
	
}
class Credit_Card implements discount
{

	@Override
	public void offer(double amount) {
double O_amount=amount;
		System.out.println("As you use credit card you will get 20% discount");
		amount=amount*0.2;
		System.out.println("Your bill amount is : "+(O_amount-amount));
	}
	
}
class Debit_Card implements discount
{

	@Override
	public void offer(double amount) {
		double O_amount=amount;
		if(amount>=5000)
		{
			System.out.println("Your bill amount is : "+amount);
			amount=amount*0.2;

			System.out.println("So you get 20% discount. Now you have to pay "+(O_amount-amount));
		}
		else
		{
			System.out.println("Your bill amount is : "+amount);
		}
	}
	
}
public class Shopping {

	public static void main(String[] args) {
		discount d;

		
			System.out.println("\n You selected Cash mode \n");
			d=new Cash();
			d.offer(1000);
			System.out.println("-------------------------------------------");
			System.out.println("\n You selected Paytm mode \n ");
			d=new Paytm();
			d.offer(1000);
			System.out.println("-------------------------------------------");
			System.out.println("\n You selected Credit_Card mode \n ");
			d=new Credit_Card();
			d.offer(1000);
			System.out.println("-------------------------------------------");
			System.out.println("\n You selected Debit_Card mode \n");
			d=new Debit_Card();
			d.offer(10000);
		
		}
	}

