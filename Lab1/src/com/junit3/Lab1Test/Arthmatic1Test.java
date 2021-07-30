package com.junit3.Lab1Test;

import com.junit3.Lab1.Arthmatic1;

import junit.framework.TestCase;

public class Arthmatic1Test extends TestCase {
	Arthmatic1 a1=null;//Resource Deceleration

	protected void setUp() throws Exception {
		System.out.println("setUP()");
		super.setUp();

		a1=new Arthmatic1();//Resource initialization
		super.setUp();
	}

	protected void tearDown() throws Exception {
		a1=null;//Resource Cleanup
		super.tearDown();
	}

	public void testSum2() {
		System.out.println("testSum2()");
		int x=a1.sum(10, 20);
		assertEquals(30,x);
		
		 x=a1.sum(100, 200);
		assertEquals(300,x);
		
		 x=a1.sum(1000, 200);
			assertEquals(1200,x);
	}

	public void testSum3() {
		System.out.println("testSum3()");
		int x=a1.sum(10, 20,10);
		assertEquals(40,x);
		
		 x=a1.sum(100, 200,300);
		assertEquals(600,x);
		
		 x=a1.sum(1000, 200,500);
			assertEquals(1700,x);
	}

	public void testSub() {
		System.out.println("testSub()");
		int x=a1.sum(10, 20);
		assertEquals(200,x);
		
		 x=a1.sum(200,300);
		assertEquals(600,x);
		
		 x=a1.sum( 200,500);
			assertEquals(100000,x);
		
	}

}
