package com.junit3.Lab1Test;

import junit.framework.Test;
import junit.framework.TestSuite;

public class TestAll {
	public static Test suite() {
		TestSuite ts=new TestSuite();
		ts.addTestSuite(Arthmatic1Test.class);
		ts.addTestSuite(Arthmatic2Test.class);
		return ts;
		
	}

}
