package com.junit3.Lab1Test;

import com.junit3.Lab1.Arthmatic1;
import com.junit3.Lab1.Arthmatic2;

import junit.framework.TestCase;

public class Arthmatic2Test extends TestCase {

	Arthmatic2 a2=null;
	protected void setUp() throws Exception {
		System.out.println("setUp()");
		
		super.setUp();
		
		a2=new Arthmatic2();//Resource initialization
		super.setUp();
	}

	protected void tearDown() throws Exception {
		a2=null;
		super.tearDown();
	}

	public void testMul2() {
		System.out.println("testMul2()");
		int x=a2.mul(10, 20);
		
		assertEquals(200,x);
		
		 x=a2.mul(100, 2);
		assertEquals(200,x);
		
			}

	public void testMul3() {
		System.out.println("testMul3()");
		int x=a2.mul(10, 20,30);
		
		assertEquals(6000,x);
		
		 x=a2.mul(100, 2,2);
		assertEquals(400,x);	}

	public void testDiv() {
		System.out.println("testDiv()");
		int x=a2.div(10,5);
		
		assertEquals(2,x);
		
		 x=a2.div(5,2);
		assertEquals(2.5,x);	
		}

}
