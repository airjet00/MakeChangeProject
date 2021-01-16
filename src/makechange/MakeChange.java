package makechange;

import java.util.Scanner;

public class MakeChange {

	static Scanner kb = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Prompted user for price of the item
		double itemPrice = enterItemPrice();

		// TODO prompt user how much money was tendered by the customer
		double amtTendered = enterAmtTendered(itemPrice);

		System.out.print(itemPrice + "\n" + amtTendered);

		// TODO If amt tendered is more than the cost of item
		// display the number of bills and coins that should be
		// given to the customer.
		//displayNumBillsCoins(itemPrice, amtTendered);
		
		kb.close();
	}

	public static double enterItemPrice() {
		// TODO Prompted user for price of the item

		System.out.print("Please enter the price of the item: ");
		double itemPrice = kb.nextDouble();
		kb.nextLine();

		if (itemPrice > 0.0) {
			return itemPrice;
		} else {
			System.out.println("Invalid amount, try again.");
			return enterItemPrice();
		}

	}

	public static double enterAmtTendered(double itemPrice) {
		// TODO prompt user how much money was tendered by he customer

		System.out.print("Please enter how much money was tendered: ");
		double amtTendered = kb.nextDouble();
		kb.nextLine();

		if (amtTendered > 0.0 && amtTendered > itemPrice) {
			return amtTendered;
		} else if (amtTendered <= itemPrice) { // Display message if customer provided too little money or exact amt
			System.out.println("Not enough cash, this isn't charity!");
			return enterAmtTendered(itemPrice);
		} else {
			System.out.println("Invalid Entry, try again.");
			return enterAmtTendered(itemPrice);
		}
	}
	/*
	public static void displayNumBillsCoins(double itemPrice, double amtTendered) {
		// TODO If amt tendered is more than the cost of item
		// display the number of bills and coins that should be
		// given to the customer.
		//bills: 20, 10, 5, 1
		//coins: .25, .10, .05, .01
		
		//while (amtTendered >)
		
		
		
	}
	public static int billsCoinCount ()  */
}
