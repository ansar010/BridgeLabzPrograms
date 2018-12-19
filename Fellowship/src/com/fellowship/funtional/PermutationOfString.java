/**
 * purpose : To print all possible permutation of string 
 * 
 * @author Ansar
 * @version 1.2
 * @since 19/12/2018
 */

package com.fellowship.funtional;

import com.fellowship.utilities.Utilities;

public class PermutationOfString 
{
	public static void main(String[] args)
	{
		System.out.println("Enter the String..");
		String str = Utilities.getWord();
		
		// Method call for all possible combination 
		Utilities.permutationString(str,0,str.length()-1);
	}
}
