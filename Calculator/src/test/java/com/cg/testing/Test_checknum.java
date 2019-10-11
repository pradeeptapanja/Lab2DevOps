package com.cg.testing;

import org.junit.Before;
import org.junit.Test;

import com.cg.cal.Check_num;

public class Test_checknum {

	Check_num obj;

	@Before
	public void init() {
		obj = new Check_num();
	}

	@Test
	public void testing_num() {
		obj.evenodd(0);
		obj.evenodd(10);
		obj.evenodd(1);
	}

	@Test
	public void testing_num2() {
		obj.evenodd(0);
		obj.evenodd(10);
		obj.evenodd(1);
	}

}
