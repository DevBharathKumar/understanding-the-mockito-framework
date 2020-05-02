package org.bharath.mockito;

import static org.junit.jupiter.api.Assertions.*;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

class TestingListUsingMockito {

	@Test
	void testingSingleThenReturn() 
	{
		List list = mock(List.class);
		when(list.size()).thenReturn(10);
		assertEquals(10,list.size());
		assertEquals(10,list.size());
	}

	@Test
	void testingMultipleThenReturn() 
	{
		List list = mock(List.class);
		when(list.size()).thenReturn(10).thenReturn(20);
		assertEquals(10,list.size());
		assertEquals(20,list.size());
	}
	
	@Test
	void testingTheGetMethod_SpecificParameter() 
	{
		List list = mock(List.class);
		when(list.get(0)).thenReturn("Random String");
		assertEquals("Random String",list.get(0));
		assertEquals(null,list.get(1));
	}
	
	@Test
	void testingTheGetMethod_GenericParameter() 
	{
		List list = mock(List.class);
		when(list.get(Mockito.anyInt())).thenReturn("Random String");
		assertEquals("Random String",list.get(0));
		assertEquals("Random String",list.get(29));
	}

	
}
