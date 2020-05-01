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

}

class ThreeTestStub implements DataService
{

	@Override
	public int[] getNumbers() {
		return new int [] {1,45,109};
	}
	
}