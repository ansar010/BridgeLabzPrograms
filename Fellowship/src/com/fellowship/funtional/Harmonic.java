/**
 * purpose : To Print Nth Harmonic Number
 * 
 * @author Ansar
 * @version 1.2
 * @since 17/12/2018
 */
package com.fellowship.funtional;

import java.util.Scanner;
import com.fellowship.utilities.Utilities;

public class Harmonic {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the N number: ");
	int n=sc.nextInt(); // n -> To get number from user
	Utilities.nHarmonicValue(n);
	sc.close();
}
}
