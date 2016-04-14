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
	
}
