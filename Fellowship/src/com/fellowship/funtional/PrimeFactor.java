/**
 * purpose : To find the Prime factors of n
 * 
 * @author Ansar
 * @version 1.2
 * @since 17/12/2018
 * 
 */
package com.fellowship.funtional;

import java.util.Scanner;
import com.fellowship.utilities.Utilities;

public class PrimeFactor 
{
	public static void main(String[] args)
	{
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the number to find the Prime factorization");
	long n = sc.nextLong(); // n -> to get number from user
	Utilities.primeFactorization(n); //Calling method to find prime factors of n 
	sc.close();
	}
}
