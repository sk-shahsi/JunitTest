package com.Junit3.Lab1.otherpkg;

import com.Junit3.Lab1.Hello;

import junit.framework.TestCase;

public class HelloTest extends TestCase {
	
	Hello hello=null;//Resource Deceleration

	protected void setUp() throws Exception {
		super.setUp();
		System.out.println("setUp()");
		super.setUp();
		
		hello=new Hello();//Resource Initialization
	}

	protected void tearDown() throws Exception {
		super.tearDown();
		hello=null;////Resource Cleanup
	}

	public void testGetMessage1() {
		System.out.println("testGetMessage1()");
		String msg=hello.getMessage1();
		assertNotNull(msg);
		//fail("Not yet implemented");
	}

	public void testGetMessage2() {
		System.out.println("testGetMessage2()");

		String msg1=hello.getMessage2();
		assertNotNull(msg1);
		//fail("Not yet implemented");
	}

}
