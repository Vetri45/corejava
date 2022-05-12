package com.chainsys.exception;

import java.util.Scanner;

public class DemoA {
	public static void main(String[] args) {
	//	m4();
		m1();
	}
	public static void m1() {
		try {
			m4();
		}
		catch(Exception err) {
			System.out.println("getmessage"+err.getMessage());
			err.printStackTrace();
		}
		finally
		{
			System.out.println("Inside m1 Finally");
		}
	}
	public static void m2()
	{
		m3();
	}
	public static void m3()
	{
		m5();
	}
		public static void m5() {
		int x =0;
		int y =0;
		int z =0;
		x = 100;
		z = x/y;
		System.out.println("Result"+z);
		}
	public static void m4() {
		System.out.println("Before Try");
		int x=0 ,y=0, z=0;
		String s1=null,s2 =null;
		java.util.Scanner sc =null ;
		try {
			sc = new Scanner (System.in);
			System.out.println("Inside Try");
			System.out.println("Enter value for X");
			s1 =sc.nextLine();
			System.out.println("Enter value for Y");
			s2 =sc .nextLine();
			x=Integer.parseInt(s1);
			y=Integer.parseInt(s2);
			z=x/y;
			System.out.println("Result"+z);
		}
		catch(ArithmeticException err) {
			System.out.println("Inside Catch1"+err.getMessage());
			System.out.println("ErrorType"+err.getClass().getName());
		}
		catch(NumberFormatException err) {
			System.out.println("Inside Catch2"+err.getMessage());
			System.out.println("ErrorType"+err.getClass().getName());
		}
		catch (Exception err) {
			System.out.println("Inside Catch3"+err.getMessage());
			System.out.println("ErrorType"+err.getClass().getName());
		}
		finally {
			System.out.println("Inside Finally");
		}
		System.out.println("Outside Finally");
		}
	}


