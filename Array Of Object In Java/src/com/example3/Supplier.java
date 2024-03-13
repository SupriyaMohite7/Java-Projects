package com.example3;

import java.util.Arrays;

public class Supplier {

	private int Sid;
	private String Sname;
	private long Smob;
	private Item[] item;
	public Supplier() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Supplier(int sid, String sname, long smob, Item[] it2) {
		super();
		Sid = sid;
		Sname = sname;
		Smob = smob;
		this.item = it2;
	}
	public int getSid() {
		return Sid;
	}
	public void setSid(int sid) {
		Sid = sid;
	}
	public String getSname() {
		return Sname;
	}
	public void setSname(String sname) {
		Sname = sname;
	}
	public long getSmob() {
		return Smob;
	}
	public void setSmob(long smob) {
		Smob = smob;
	}
	public Item[] getItem() {
		return item;
	}
	public void setItem(Item[] item) {
		this.item = item;
	}
	@Override
	public String toString() {
		return "Supplier [Sid=" + Sid + ", Sname=" + Sname + ", Smob=" + Smob + ", item=" + Arrays.toString(item) + "]";
	}
	
	
}
