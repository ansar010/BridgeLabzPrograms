package com.fellowship.funtional;

import com.fellowship.utilities.Utilities;

public class Coupon
{
	public static void main(String[] args)
	{
		System.out.println("Enter Number of Coupons you want..!");
		int[] coupons = Utilities.createIntArr();
		
		System.out.println("Total randrom number / Turns to needed for distinct coupons : "+Utilities.totalIterations(coupons));
	}
}
