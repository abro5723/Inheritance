package model;

public class Change implements Exchange
{
	private String value;
	private String material;
	private int year;
	
	public String getValue() 
	{
		return value;
	}
	public void setValue(String value) 
	{
		this.value = value;
	}
	public String getMaterial() 
	{
		return material;
	}
	public void setMaterial(String material) 
	{
		this.material = material;
	}
	public int getYear() 
	{
		return year;
	}
	public void setYear(int year) 
	{
		this.year = year;
	}
	
	
	
	
	public void amount(int currentMoney) 
	{
		
	}
	
	public void payment(int moneyNeeded) 
	{
		
	}
	
	public double change() 
	{
		return 0;
	}
	
	public double newAmount() 
	{
		return 0;
	}
	
	
}
