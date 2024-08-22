package multitread;

import java.util.Scanner;

class HusbandThread implements Runnable
{
	Thread t;
	Bank b;
	HusbandThread(Bank b)
	{
		this.b=b;
		t=new Thread(this,"DepositThread");
		t.start();
	}
	@Override
	public void run() {
		try {
			b.deposit();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}	
}
class WifeThread implements Runnable
{
	Thread t;
	Bank b;
	WifeThread(Bank b)
	{
		this.b=b;
		t=new Thread(this,"WithdrawThread");
		t.start();
	}
	@Override
	public void run() {
		try {
			b.withdraw();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}	
}


class Bank
{
	private volatile double balance=5000;
	private int wamount;
	private int damount;
	
	synchronized void  deposit() throws InterruptedException
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("\n balance before Deposit \t "+balance);
		Thread.sleep(1000);
		System.out.println("\n Enter deposit amount \t");
		damount=sc.nextInt();
		balance=balance+damount;
		Thread.sleep(1500);
		System.out.println("\n Balance after deposit \t"+balance);
		
		
	}
	
	synchronized void withdraw() throws InterruptedException
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("\n balance before withdraw \t"+balance);
		Thread.sleep(1000);
		System.out.println("\n Enter withdraw amount \t");
		wamount=sc.nextInt();
		balance=balance-wamount;
		Thread.sleep(1500);
		System.out.println("\n Balance after withdraw \t"+balance);
		
	}
	
}

public class ThreadSynchronization2 {

	public static void main(String[] args) {
		Bank b=new Bank();
		HusbandThread h=new HusbandThread(b);
		WifeThread w=new WifeThread(b);
		
		

	

}

}
