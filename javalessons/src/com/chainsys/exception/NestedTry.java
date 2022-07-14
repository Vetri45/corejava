package com.chainsys.exception;

import java.util.Scanner;

public class NestedTry {
	static String[] data;
	

	public static void main(String[] args) {
		int num =0;
		int numValue =0;
		data = new String[2];
		java.util.Scanner sc =null;
		try {
			sc=new Scanner (System.in);
			try {
				System.out.println("Enter value for X");
				data[0]=sc.nextLine();
				numValue =Integer .parseInt(data[0]);
				System.out.println("The Square is"+numValue*numValue);
			}
			catch(NumberFormatException err) {
				System.out.println("Not a number!");
			}
           num =data.length;
           System.out.println("Array Length"+num);
	}
catch(ArrayIndexOutOfBoundsException err) {
	System.out.println("ArrayIndexOutOfBounds - no arguments given");
}
		catch(Exception err) {
			System.out.println("Exception"+err.getMessage());
		}
}
}
