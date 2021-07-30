package com.Junit4.Lab1;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.Junit3.Lab1.Hello;

public class HelloTest {
	Hello hello=null;//Resource deceleration

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		System.out.println("init()");
		hello=new Hello();
		
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testGetMessage1() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetMessage2() {
		fail("Not yet implemented");
	}

}
