package com.cg.cal;

public class Check_num {

	private String str;

	public String evenodd(int n) {
		if (n == 0) {
			str = "zero";
		} else if (n % 2 == 0) {
			str = "even";
		} else {
			str = "odd";
		}
		System.out.println(str);
		return str;
	}
}
