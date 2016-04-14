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
	
	public int compareTo(Object compared)
	{
		int comparedValue = Integer.MIN_VALUE;
		
		{
			if(this.change() > ((Exchange) compared).change())
			{
				comparedValue = 1;
			}
			else if(this.change() < ((Exchange) compared).change())
			{
				comparedValue = -1;
			}
			else
			{
				comparedValue = 0;
			}
		}
		
		return comparedValue;
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
