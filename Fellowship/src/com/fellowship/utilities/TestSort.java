package com.fellowship.utilities;

public class TestSort {
public static void main(String[] args) {

	int arr[] = {12, 11, 13, 5, 6, 7}; 
	sort(arr, 0, arr.length-1); 

}
static void sort(int arr[], int l, int r) 
{ 
	if (l < r) 
	{ 
		// Find the middle point 
		int m = (l+r)/2; 

		         // System.out.println("sort1 "+m);

      // Sort first and second halves 
		sort(arr, l, m); 
        System.out.println("sort1 "+m);

		sort(arr , m+1, r); 
		System.out.println("sort2 "+m);
		// Merge the sorted halves 
		//merge(arr, l, m, r); 
	} 
} 
}