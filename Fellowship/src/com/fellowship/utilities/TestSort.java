package com.fellowship.utilities;

public class TestSort {
public static void main(String[] args) {
	String  str[]= {"b","A","c","e","d"};
	Utility.stringBubbleSort(str);
	for(int i =0;i<str.length;i++)
{
	System.out.print(str[i]);
	
}
}
}