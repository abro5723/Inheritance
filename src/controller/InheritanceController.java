package controller;

import java.util.ArrayList;

import model.Exchange;

public class InheritanceController 
{
	private ArrayList<Exchange> exchangeList;
	
	public String showExchangeResults()
	{
		String exchangeResults= "";
		
		return exchangeResults;
	}
	
	private void swap(int firstLocation, int secondLocation)
	{
		Exchange temp = exchangeList.get(firstLocation);
		exchangeList.set(firstLocation, exchangeList.get(secondLocation));
		exchangeList.set(secondLocation, temp);
	}
	
	public void insertionSort()
	{
		for(int outerLoop = 1; outerLoop < exchangeList.size(); outerLoop++)
		{
			int innerLoop = outerLoop;
			while(innerLoop > 0 && (exchangeList.get(innerLoop - 1).
					compareTo(exchangeList.get(innerLoop)))>0)
					{
						swap(innerLoop, innerLoop-1);
						innerLoop--;
					}
		}
	}
	
	public void quickSort(int low, int high)
	{
		if(low < high)
		{
			int midPoint = partition(low, high);
			quickSort(low, midPoint-1);
			quickSort(midPoint + 1, high);
		}
	}
	
	private int partition(int low, int high)
	{
		int  partitionPoint=0;
		Exchange pivot = exchangeList.get(high);
		int position = low; 
		for(int spot = low; spot < high-1; spot++)
		{
			if(exchangeList.get(spot).compareTo(pivot) <= 0)
			{
				swap(position, spot);
				position++;
			}
		}
		swap(position, high);
		
		return position;
	}
}
