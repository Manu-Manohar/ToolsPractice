package com.nt.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import com.nt.service.ArithematicApp;

public class AppTest
{
	@Test
	public void testWithPositive()
	{
		ArithematicApp arr=new ArithematicApp();
		int expected=30;
		int actual=arr.sum(20, 10);
		assertEquals(expected,actual);
	}

}
