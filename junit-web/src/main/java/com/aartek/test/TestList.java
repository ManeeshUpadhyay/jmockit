package com.aartek.test;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.aartek.controller.ListAdd;

public class TestList {

	List<Integer> list1;

	@BeforeClass
	public static void beforeClass() {
		System.out.println("before classs method");
	}

	@Before
	public void addition() {
		list1 = new ArrayList<Integer>();
		list1.add(12);
		list1.add(13);
		list1.add(25);
		list1.add(50);

		System.out.println("Before Method..");

	}

	@Test
	public void test() {

		System.out.println("Test Method...");
		ListAdd listAdd = new ListAdd();
		int result = listAdd.add(list1);
		assertEquals(100, result);
		assertEquals(100, result);

		// fail("Not yet implemented");
	}

	@After
	public void after() {
		list1=null;
		System.gc();
		assertNull(list1);
		try {
			finalize();
			
			
		} catch (Throwable e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("after method");
		
	}

	@AfterClass
	public static void afterClass() {
		System.out.println("after class method..");
	}
}
