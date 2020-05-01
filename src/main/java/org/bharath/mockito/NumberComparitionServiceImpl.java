package org.bharath.mockito;

import org.springframework.beans.factory.annotation.Autowired;

public class NumberComparitionServiceImpl
{
	
	@Autowired
	private DataService dataService;

	public NumberComparitionServiceImpl(DataService dataService) {
		super();
		this.dataService = dataService;
	}
	
	public int getLargestNumber()
	{
		int [] numbers = dataService.getNumbers();
		
		int largestNumber = Integer.MIN_VALUE;
		
		for(int i=0; i<numbers.length; i++)
		{
			if(numbers[i] > largestNumber)
			{
				largestNumber = numbers[i];
			}
		}
		
		return largestNumber;
	}
	
}
