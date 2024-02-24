package com.Interface;

interface Messages
{
	void sendmsg(String msg);
	
}
class whatsapp implements Messages{
	String type;
	public whatsapp()
	{
		
	}
	@Override
	public void sendmsg(String msg) {
this.type="whatsapp";
System.out.println(type+" : "+msg);
	}
	
}class Telegram implements Messages{
	String type;
	public Telegram()
	{
		
	}
	@Override
	public void sendmsg(String msg) {
this.type="telegram";
System.out.println(type+" : "+msg);
	}
	
}
public class TightCouple {
	//tight couple
	public void msgnotify(whatsapp w,String m)
	{
		w.sendmsg(m);
	}
	public void msgnotifyT(Telegram t,String m)
	{
		t.sendmsg(m);
	}
	// Loose coupling
		public void msgNotify(Messages ser,String m)
		{
		  ser.sendmsg(m);
		}

	public static void main(String[] args) {
		TightCouple obj= new TightCouple();
		
		whatsapp w1= new whatsapp();
		obj.msgnotify(w1, "tight couple to whatsapp");
		Telegram t1=new Telegram();
		obj.msgnotifyT(t1, "tight couple to telegram");
		System.out.println("==========Loose couple=========");
		Messages s;
		s= new whatsapp();
		obj.msgNotify(s, "Welcome");
		s=new Telegram();
		obj.msgNotify(s, "Hello");
	}

}
