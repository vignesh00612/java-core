package com.learning.core.day10;


import static org.junit.Assert.assertEquals;
import org.junit.Test;



public class D10P09 {
	
	@Test
	public void testfindMax()
	{
		assertEquals(6,Calculator.findMax(new int[] {1,2,3,4,5,6}));
		
	}

}