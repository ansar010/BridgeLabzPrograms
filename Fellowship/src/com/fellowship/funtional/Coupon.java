/**
 * purpose : Given N distinct Coupon Numbers, how many random numbers do you
 * 			 need to generate distinct coupon number? This program simulates this random
 *			 process.
 *
 *@author Ansar
 *@version 1.2
 *@since 18/12/2018
 */
package com.fellowship.funtional;

import com.fellowship.utilities.Utilities;

public class Coupon
{
	public static void main(String[] args)
	{
		System.out.println("Enter Number of Coupons you want..!");
		int[] coupons = Utilities.createIntArr(); // Calling method to create and insert integer in array
		
		// calling method to get distinct random number
		System.out.println("Total randrom number / Turns to needed for distinct coupons : "+Utilities.totalIterations(coupons));
	}
}
