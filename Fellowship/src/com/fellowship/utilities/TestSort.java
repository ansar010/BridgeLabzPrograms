package com.fellowship.utilities;

public class TestSort {
public static void main(String[] args) {
	int  str[]= {5,3,2,1};
	Utility.bubbleSortInt(str);
int indx=	Utility.binarySearchIntNonRec(str, 0,str.length-1, 1);
int in = Utility.binarySearchInt(str, 0, str.length-1, 1);
	for(int i =0;i<str.length;i++)
	{
	System.out.print(str[i]);
	
	}
	System.out.println("\n"+indx);
	System.out.println(in);
}
}