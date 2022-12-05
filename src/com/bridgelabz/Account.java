package com.bridgelabz;

/***
 * 
 * @author Admin
 *
 */
public class Account {
	long balance = 99999;

	/***
	 * 
	 * @param amount
	 * @return
	 */
	public long debit(int amount) {
		/*
		 * Used If else condition to Check the condition
		 */
		if (balance >= amount) {
			balance = balance - amount;
			System.out.println("$" + amount + " debited from your account");
			return balance;
		} else {
			System.out.println("Debit amount exceeded account balance");
			return balance;
		}
	}

}
