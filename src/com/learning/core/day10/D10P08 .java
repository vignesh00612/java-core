package com.learning.core.day10;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class D10P08 {

	@Test
	public void testMul()
	{
		assertEquals(10,Calculator.mul(5, 2));
	}
	@Test
	public void testDiv()
	{
		assertEquals(5,Calculator.div(10, 2));
	}

}