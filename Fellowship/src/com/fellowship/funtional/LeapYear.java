/**
 * purpose : To check the given year is leap year or not 
 * 
 * @author Ansar
 * @version 1.2
 * @since 15/12/2018
 */
package com.fellowship.funtional;
import java.util.Scanner;
import com.fellowship.utilities.Utilities;

public class LeapYear 
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Year to Check whether it is Leap Year or Not..!");
		int year = sc.nextInt();
		Utilities.isLeapYear(year); //calling method to check leap year
		sc.close();
	}
}
