/******************************************************************************
 * Purpose : To Flip Coin and Calculate Percentage
 * 
 * @author Ansar
 * @version 1.2
 * @since 15/12/2018
 ******************************************************************************/
package com.fellowship.funtional;

import com.fellowship.utilities.Utilities;

public class FlipCoinRunner 
{	/*
	 *The main function written to run the flipCoin
	 */
	public static void main(String[] args)
	{

		System.out.println("Enter the number of times You want to flip Coin..");
		int n = Utilities.getInt();  // n-> Number of time user want to flip coin
		Utilities.flipCoin(n); // calling method to flip coin and calculate percentage
		
	}
}
