package com.aartek.test;

import static org.junit.Assert.*;

import org.junit.Test;

import com.aartek.controller.Addition;

public class TestAddition {

	@Test
	public void test() {
		
		Addition addition= new Addition();
		assertEquals(6, addition.add(3, 3));
		assertEquals(1, addition.add(-3, 4));
		assertEquals(-1, addition.add(3, -4));
		assertEquals(-6, addition.add(-3, -3));
		//fail("Not yet implemented");
	}

}
