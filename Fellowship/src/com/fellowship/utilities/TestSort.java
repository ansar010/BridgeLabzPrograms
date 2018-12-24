package com.fellowship.utilities;

public class TestSort {
public static void main(String[] args) {
	String  str[]= {"A","E","d","c"};
	Utility.stringBubbleSort(str);
//int indx=	Utility.binarySearchIntNonRec(str, 0,str.length-1, 1);
int in = Utility.stringBinarySearch(str, 0, str.length-1, "e");
	for(int i =0;i<str.length;i++)
	{
	System.out.print(str[i]);
	
	}
	//System.out.println("\n"+indx);
	System.out.println("\n"+in);
}
}