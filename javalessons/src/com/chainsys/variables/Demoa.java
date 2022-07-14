package com.chainsys.variables;

public class Demoa{
	public static int DataA; //static global variable
	public final int DataB; //immutable global variable (not static)
	public final static int DataC=300; //constant
	
	//constructor
	public Demoa (int dataB)
	{
		this.DataB=dataB;
	}
	/**
	 * static method can be called without an object
	 */
	public static void sayHello()
	{
		System.out.println("Hello Developer!!!");
	}
	/**
	 * greetUser is a
	 */
	public void greetUser()
	{
		System.out.println("greeting User!!!");
	}

}
