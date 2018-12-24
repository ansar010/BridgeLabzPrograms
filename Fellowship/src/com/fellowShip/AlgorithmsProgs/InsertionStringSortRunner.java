package com.fellowShip.AlgorithmsProgs;

import com.fellowship.utilities.Utility;

public class InsertionStringSortRunner 
{
	public static void main(String[] args) 
	{
		System.out.println("Enter the Number of words : ");
		int size = Utility.getInt();
		String words[] = new String[size];
		System.out.println("Enter "+size+" Elements");
		
		for(int i =0;i<words.length;i++)
		{
			words[i]=Utility.getWord();
		}
		Utility.stringInsertionSort(words);
		System.out.println("Sorted List : ");
		for(int i = 0;i<words.length;i++)
		{
			System.out.println(i+1+" "+words[i]);
		}
	}
}
