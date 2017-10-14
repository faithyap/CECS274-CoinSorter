package edu.kapiva;

public class SCStester {
	public static void main(String[] args){
		Coin penny = new Coin(0.01, "penny");
		Coin nickel = new Coin(0.05, "nickel");
		Coin dime = new Coin(0.10, "dime");
		Coin quarter = new Coin(0.25, "quarter");
		Coin dollar = new Coin(1.00, "dollar");
		
		
		Coin[] coins = {nickel, dime, dollar, penny, quarter, nickel};
		
		//Printing unsorted array of coins
		System.out.print("Unsorted: " );
		for(int i = 0; i < coins.length; i++){
			System.out.print( coins[i].getName() + ", ");
		}
		System.out.print("\n" );
		
		//Sorting
		SelectionCoinSorter.sort(coins);
		
		//Printing sorted array of coins and expected array
		System.out.print("\nSorted: " );	
		for(int i = 0; i < coins.length; i++){
			System.out.print(coins[i].getName() + ", ");
		}
		System.out.println("\nExpected: penny, nickel, nickel, dime, quarter, dollar,");
	}
}
