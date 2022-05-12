package com.chainsys.Interface;

public class TestInterface {
public static void main (String [] args)
{
	InterfaceA.echo();
	InterfaceA a1=new InterfaceCImpl();
	a1.print();
	a1.print("Hello");


}
}
