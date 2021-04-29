package com.vararg.tutorial;

public class Test1 {
	public static void i(int... x) {
		System.out.println("the vararg "); 
	}

	public static void main(String[] args) {
	 i();
	 i(1);
	 i(2);

	}

}
