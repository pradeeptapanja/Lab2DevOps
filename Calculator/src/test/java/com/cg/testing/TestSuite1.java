package com.cg.testing;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

public class TestSuite1 {
	public static void main(String[] args) {
		Result result = JUnitCore.runClasses(TestCalculation.class, Test_checknum.class);
		for (Failure failure : result.getFailures()) {
			System.out.println(failure.toString());
		}  
		System.out.println(result.wasSuccessful());
		System.out.println(result.getRunCount());
		System.out.println(result.getRunTime());
		System.out.println(result.getFailures());
	}
}
