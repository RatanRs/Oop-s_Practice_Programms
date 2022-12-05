package com.bridgelabz;

/***
 * 
 * @author Admin
 *
 */

public class StockAccountManagement {
	/***
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		/*
		 * Creating object of Stockportfolio and calling the method
		 */
		StockPortfolio stockPortfolio = new StockPortfolio();
		stockPortfolio.stocksPortfolio();
		System.out.println(stockPortfolio.stockList);
	}
}
