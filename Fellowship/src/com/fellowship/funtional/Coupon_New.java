/**
 * purpose : To generate random distinct coupon Numbers 
 * 
 * @author Ansar
 * @version 1.2
 * @since 18/12/2018
 */
package com.fellowship.funtional;

import com.fellowship.utilities.Utilities;

public class Coupon_New 
{
	public static void main(String[] args) 
	{
		System.out.println("Enter the Number of coupons U want..!");
		
		// n->to get numbers from user
		int n = Utilities.getInt();
		
		// Calling method to generate distinct coupon number
		Utilities.couponNew(n);
	}
}
