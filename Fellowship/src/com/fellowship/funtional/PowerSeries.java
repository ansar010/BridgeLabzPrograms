/**
 * purpose : Generate power series of 2 upto n
 * 
 * @author Ansar
 * @version 1.2
 * @since 17/12/2018
 */
package com.fellowship.funtional;
import java.util.Scanner;
import com.fellowship.utilities.Utilities;

public class PowerSeries {
	public static void main(String[] args)
	{	
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number : ");
		int num = sc.nextInt(); //num -> To get Number from user
		Utilities.powerSeries(num); //Calling Method to generate power series of n
		sc.close();

	}
}
