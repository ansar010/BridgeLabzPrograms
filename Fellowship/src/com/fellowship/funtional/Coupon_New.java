package com.fellowship.funtional;

import com.fellowship.utilities.Utilities;

public class Coupon_New 
{
	public static void main(String[] args) 
	{
		System.out.println("Enter the Number of coupons U want..!");
		int n = Utilities.getInt();
		Utilities.couponNew(n);
	}
}
