package com.chainsys.unittest;

import com.chainsys.variables.Bank;
/**
 * 
 * @author vetr3139
 *
 */
public class Banktest {

	private static String currentBalance;

	public static void testDeposit() {
		System.out.println("Before Balance " + Banktest.currentBalance);
		Bank.deposit(10000);
		System.out.println("After Balance " + Bank.currentBalance);
	}

	public static void testWithdraw() {
		System.out.println("Before Balance " + Bank.currentBalance);
		int withdraw = Bank.withdraw(5000);
		System.out.println("total amount is" + withdraw);
		System.out.println("After Balance " + Bank.currentBalance);
	}

	public static void testOpenaccount() {
		Bank.openAccount("Vetri", 987654332);
		System.out.println(Bank.customerName);
		System.out.println(Bank.accountNumber);

	}
}
