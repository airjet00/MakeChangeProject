package makechange;

import java.util.Scanner;

public class MakeChange {

	static Scanner kb = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Prompted user for price of the item
		double itemPrice = enterItemPrice();

		// TODO prompt user how much money was tendered by the customer
		double amtTendered = enterAmtTendered(itemPrice);
		double amtChange = amtTendered - itemPrice;
		
		System.out.println("Amount: "+itemPrice + ", " 
				+ "Tendered: " + amtTendered);

		// TODO If amt tendered is more than the cost of item
		// display the number of bills and coins that should be
		// given to the customer.
		//displayNumBillsCoins(itemPrice, amtTendered);
		// need to count 20, 10, 5, 1, .25, .10, .05, .01
		int bill20 = 0, bill10 = 0, bill05 = 0, bill01 = 0;
		int coin25 = 0, coin10 = 0, coin05 = 0, coin01 = 0;
		double countChange = amtChange;
		String result = "Result:";
		
		while(countChange > 0.01){
			if (countChange >= 20) {
				bill20 = (int)(countChange / 20.00);
				countChange %= 20;
				result += " " + bill20 + " twenty dollar bill(s),";
			}else if (countChange >= 10) {
				bill10 = (int)(countChange / 10.00);
				countChange %= 10;
				result += " " + bill10 + " ten dollar bill(s),";
			}else if (countChange >= 5) {
				bill05 = (int)(countChange / 5.00);
				countChange %= 5;
				result += " " + bill05 + " five dollar bill(s),";
			}else if (countChange >= 1) {
				bill01 = (int)(countChange / 1.00);
				countChange %= 1;
				result += " " + bill01 + " one dollar bill(s),";
			}else if (countChange >= .25) {
				coin25 = (int)(countChange / .25);
				countChange %= .25;
				result += " " + coin25 + " quarter(s)";
			}else if (countChange >= .10) {
				coin10 = (int)(countChange / .10);
				countChange %= .10;
				result += " " + coin10 + " dime(s)";
			}else if (countChange >= .05) {
				coin05 = (int)(countChange / .05);
				countChange %= .05;
				result += " " + coin05 + " nickel(s)";
			}else if (countChange >= .01) {
				coin01 = (int)(countChange / .01);
				countChange %= .01;
				if (countChange > 0.009 && countChange < 0.01) {
					coin01++;
				}
				result += " " + coin01 + " penny(ies)";
			}
		}
		
		System.out.println(result);

		
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
	public static void displayNumBillsCoins(double itemPrice, 
											double amtTendered) {
		// TODO If amt tendered is more than the cost of item
		// display the number of bills and coins that should be
		// given to the customer.
		//bills: 20, 10, 5, 1
		//coins: .25, .10, .05, .01
		
		//while (amtTendered >)
		
		
		
	}
	public static int billsCoinCount ()  */
}
