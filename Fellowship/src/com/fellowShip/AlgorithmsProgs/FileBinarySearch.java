
package com.fellowShip.AlgorithmsProgs;

import java.io.BufferedReader;
//import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import com.fellowship.utilities.Utility;

public class FileBinarySearch 
{
	public static void main(String[] args) 
	{
		String []strFile = readFileStrArr();
		
		System.out.println("Unsorted string File");
		System.out.println("====================");
		Utility.displayStrArr(strFile);
		
		Utility.stringBubbleSort(strFile);
		
		System.out.println("\n\nSorted File");
		System.out.println("===========");
		Utility.displayStrArr(strFile);
		
		System.out.print("\nEnter the Element You want to search : ");
		String search=Utility.getLine();
		
		int index=Utility.stringBinarySearch(strFile, 0, strFile.length-1, search);
		if(index==-1)
		{
			System.out.println("Word Not Found..!");
		}
		else
		{
			System.out.println("Element found in index of "+index);
		}
		
	
	}
	private static String[] readFileStrArr()
	{
		try {
			BufferedReader br = new BufferedReader(new FileReader("/home/admin1/Desktop/ProgFiles/FileBinarySearch.txt"));
			String string="";
			try {
				while((string=br.readLine())!=null)
				{
					return string.split(" ");//split by space
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		return null;
	}
}
