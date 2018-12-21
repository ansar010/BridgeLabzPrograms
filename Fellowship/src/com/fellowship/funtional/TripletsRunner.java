/**
 * purpose : A program with cubic running time. Read in N integers and counts the
 *			 number of triples that sum to exactly 0. 
 *
 *@author Ansar
 *@version 1.2
 *@since 18/12/2018
 */
package com.fellowship.funtional;
import com.fellowship.utilities.Utilities;
public class TripletsRunner 
{	/*
	 *The main function written to run the Triplets
	 */
	public static void main(String[] args) 
	{
		System.out.println("Enter the number of inputs");
		int[] arr=Utilities.createIntArr();
		int l = arr.length;
		
		// Calling method to Display the Elements
		Utilities.displayArr(arr);
		 // Calling method to give triplets of zero
		Utilities.tripletsZero(arr,l);
	}
}
