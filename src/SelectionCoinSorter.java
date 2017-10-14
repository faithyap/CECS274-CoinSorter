package edu.kapiva;

public class SelectionCoinSorter {
	
		/**
		  Sorts an array of the type Coin, using selection sort.
		  @param coins the array to sort
		*/
		public static void sort(Coin[] coins)
		{ 
                    // (1) Create double array to hold numeric values
                    double[] numericValue = new double[coins.length];
                    for (int i = 0; i < coins.length; i++)
                    {
                        numericValue[i] = coins[i].getValue();
                    }
                    // (2) Sort the coin and double arrays by calling other methods
                    for (int i = 0; i < coins.length - 1; i++)
                    {
                        int minPos = minimumPosition(numericValue, i);
                        coinSwap(coins, i, minPos);
                        swap(numericValue, i, minPos);
                    }
		}
		
		/**
		  Finds the smallest Coin element in a tail range of the array.
		  @param coins the array to sort
		  @param from the first position in a to compare
		  @return the position of the smallest element in the range coins
		*/
		private static int minimumPosition(double[] coins, int from)
		{ 
                    int minPos = from;
                    for (int i = from + 1; i < coins.length; i++)
                    {
                        if (coins[i] < coins[minPos])
                        {
                            minPos = i;
                        }
                    }
                    return minPos;
		}
	
	   /**
	      Swaps two entries of an array of the type Coin.
	      @param coins the array
	      @param i the first position to swap
	      @param j the second position to swap
	   */
	   public static void coinSwap(Coin[] coins, int i, int j)
	   {
               Coin temp = coins[i];
               coins[i] = coins[j];
               coins[j] = temp;
	   }
	   
	   /**
	      Swaps two entries of an array of the type double.
	      @param coinValues the array
	      @param i the first position to swap
	      @param j the second position to swap
	   */
	   public static void swap(double[] coinValues, int i, int j)
	   {
		double temp = coinValues[i];
                coinValues[i] = coinValues[j];
                coinValues[j] = temp;
	   }
}
