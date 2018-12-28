package com.fellowShip.AlgorithmsProgs;

import com.fellowship.utilities.Utility;

public class BinaryToDecRunner 
{
	public static void main(String[] args)
	{
		System.out.print("Enter the decimal Number : ");
		int decNum=Utility.getInt();
		
		String binary=Utility.toBinary(decNum);
		Utility.padding(binary);
		
	}
}
