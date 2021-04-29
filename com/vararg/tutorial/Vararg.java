package com.vararg.tutorial;

public class Vararg {
public static void sum(int... x) {
	int total = 0;
	for(int y : x) {
		total += y; 
	}
	System.out.println("the total of sum : "+total);
}
	public static void main(String[] args) {
       sum();
       sum(10,20);
       sum(10,20,30);
       sum(41,54);
	}

}
