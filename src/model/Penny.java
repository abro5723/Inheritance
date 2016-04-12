package model;

public class Penny extends Change
{

	public Penny()
	{
		this.setMaterial("Copper");
		this.setValue("1¢");
		this.setYear(1901);
	}
	
	public double change()
	{
		double Change = 0;
		return Change;
	}
	
	public String toString()
	{
		return "";
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
}
