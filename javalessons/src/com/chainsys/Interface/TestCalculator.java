package com.chainsys.Interface;

public class TestCalculator {
	public static void main(String[] args) {
		Calculator cal = new Calculator();

		int output = cal.add(10, 5);
		System.out.println(output);
		output = cal.multiply(10, 5);
		System.out.println(output);
		output = cal.divide(10, 5);
		System.out.println(output);

	}
}



