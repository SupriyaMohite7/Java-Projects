package com.example3;

public class Item {

	private int Iid;
	private String Iname;
	private double Icost;
	public Item() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Item(int iid, String iname, double icost) {
		super();
		Iid = iid;
		Iname = iname;
		Icost = icost;
	}
	public int getIid() {
		return Iid;
	}
	public void setIid(int iid) {
		Iid = iid;
	}
	public String getIname() {
		return Iname;
	}
	public void setIname(String iname) {
		Iname = iname;
	}
	public double getIcost() {
		return Icost;
	}
	public void setIcost(double icost) {
		Icost = icost;
	}
	@Override
	public String toString() {
		return "Item [Iid=" + Iid + ", Iname=" + Iname + ", Icost=" + Icost + "]";
	}
	
	
}
