package com.cg.testing;

import org.junit.Before;
import org.junit.Test;

import com.cg.cal.Calculations;

public class TestCalculation {

	Calculations obj;

	@Before
	public void init() {
		obj = new Calculations();
	}

	@Test
	public void testing() {
		obj.add(10, 20);
		obj.multiply(5, 8);
	}
}
