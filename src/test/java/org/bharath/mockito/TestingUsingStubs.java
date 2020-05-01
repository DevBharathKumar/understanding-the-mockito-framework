package org.bharath.mockito;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestingUsingStubs
{

	@Test
	void testingThreeNumbers() 
	{
		NumberComparitionServiceImpl numberComparitionServiceImpl = new NumberComparitionServiceImpl(new ThreeTestStub());
		assertEquals(109, numberComparitionServiceImpl.getLargestNumber());
	}
	
	@Test
	void testingOneNumber() 
	{
		NumberComparitionServiceImpl numberComparitionServiceImpl = new NumberComparitionServiceImpl(new OneTestStub());
		assertEquals(1, numberComparitionServiceImpl.getLargestNumber());
	}

}

class ThreeTestStub implements DataService
{

	@Override
	public int[] getNumbers() {
		return new int [] {1,45,109};
	}
	
}

//Disadvantage of the stub is that each time we need to create a new class to pass the data 
class OneTestStub implements DataService
{

	@Override
	public int[] getNumbers() {
		return new int [] {1};
	}
	
}