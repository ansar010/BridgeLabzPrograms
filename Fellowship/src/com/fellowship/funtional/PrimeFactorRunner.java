/**********************************************************
 * purpose : To find the Prime factors of n
 * 
 * @author Ansar
 * @version 1.2
 * @since 17/12/2018
 * 
 **********************************************************/
package com.fellowship.funtional;

import com.fellowship.utilities.Utilities;

public class PrimeFactorRunner 
{	/*
	 *The main function written to run the primeFactorization
	 */
	public static void main(String[] args)
	{
	System.out.println("Enter the number to find the Prime factorization");
	long n = Utilities.getLong(); // n -> to get number from user
	Utilities.primeFactorization(n); //Calling method to find prime factors of n 
	}
}