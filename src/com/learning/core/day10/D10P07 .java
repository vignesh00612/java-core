package com.learning.core.day10;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class D10P07 {
	
	@Test
	public void testadd()
	{
		assertEquals(3,Calculator.add(1, 2));
	}
	@Test
	public void testsub()
	{
		assertEquals(3,Calculator.sub(5, 2));
	}

}