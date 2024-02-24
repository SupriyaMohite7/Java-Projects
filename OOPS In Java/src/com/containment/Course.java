package com.containment;

public class Course {

	private int cid;
	private String cname;
	private double fees;
	Course()
	{
		
	}
	Course(int cid,String cname,double fees)
	{
		this.cid=cid;
		this.cname=cname;
		this.fees=fees;
	}
	public void setCid(int cid)
	{
		this.cid=cid;
	}
	public int getCid()
	{
		return cid;
	}
	public void setCname(String cname)
	{
		this.cname=cname;
	}
	public String getCname()
	{
		return cname;
	}
	public void setFees(double fees)
	{
		this.fees=fees;
	}
	public double getFees()
	{
		return fees;
	}
	@Override
	public String toString()
	{
		return "course : Id :"+cid+" Name :"+cname+" Fees :"+fees;
		
	}
}
