package org.bharath.mockito;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

class TestingUsingMockito {

	
	@Test
	void testingTwoNumbers() 
	{
		DataService dataService = mock(DataService.class);
		when(dataService.getNumbers()).thenReturn(new int [] {1,67,90});
		NumberComparitionServiceImpl numberComparitionServiceImpl = new NumberComparitionServiceImpl(dataService);
		assertEquals(90,numberComparitionServiceImpl.getLargestNumber());
	}

}
