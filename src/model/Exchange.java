package model;

public interface Exchange 
{
	public void amount(int currentMoney);
	public void payment(int moneyNeeded);
	public double change();
	public double newAmount();
	public int compareTo(Object thing);
}
