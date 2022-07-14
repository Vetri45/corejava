package com.chainsys.unittest;

import classandmethods.Car;

/**
 * 
 * @author vetr3139
 *
 */
public class CarTest {
	public static void testcar()
	{
		Car firstCar=new Car ("TN 11A 001");
		firstCar.setColor("Red");
		firstCar.setFuel("petrol");
		firstCar.setYearOfpurchase(2022);
		System.out.println(firstCar.getRegNo());
		System.out.println(firstCar.getColor());
		System.out.println(firstCar.getFuel());
		System.out.println(firstCar.getYearOfpurchase());
	}

}
