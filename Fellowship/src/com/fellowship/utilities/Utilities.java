package com.fellowship.utilities;
import java.util.Scanner;

public class Utilities {

	static Scanner sc = new Scanner(System.in);

	//1.Method to replace String
	/**
	 * @param To replace string 
	 */
	static public void replaceString(String username)
	{
		// tmpl_Str refers template
		String tmpl_Str = "Hello <<UserName>>, How are you?";

		//To ensure user-name has minimum 3 char
		if(username.length()<3)
		{
			System.err.println("Username should has minimum 3 char");	
		}
		else
		{
			//temp refers to temporary variable
			String temp="";
			temp += tmpl_Str.substring(0,6);// substring() method used to get substring of template
			temp += username;
			temp += tmpl_Str.substring(18,tmpl_Str.length());
			System.out.println(temp);
		}
	}
	//********************************************************************************



	//2.Method to Flip Coin and calculate percentage
	/**
	 * 
	 * @param n Number of time to flip coin 
	 */
	public static void flipCoin(int n)
	{
		if(n<0) //To Ensure Positive integer
		{
			System.out.println("Enter positive integer..!!");
			n = sc.nextInt();
			flipCoin(n); //recursive approach
		}
		else {
			// response -> to get user choice  
			int count=1,response;
			double heads=0,tails=0;

			do
			{
				System.out.println("\nEnter:\n 1-> To flip coin.\n 0-> To Exit.");
				response=sc.nextInt();
				if(response==1)
				{
					if(cointoss()==1)  // Calling method to Toss Coin
						tails++;       //Increasing tails value to get count
					else
						heads++;       //Increasing heads value to get count 
				}
				else if(response==0)
				{
					System.out.println("You Quit the game..!");
				}
				else if(response>1)
				{
					System.out.println("Please Enter valid number 0 or 1");
				}
				count++;

			}while(count<=n&&response!=0); //Condition to repeat loop 
			//and exit game if user give 0
			System.out.println("\nNumber of time Heads : "+heads);
			System.out.println("Number of time Tails : "+tails);

			double percentHeads=heads/n*100;     //Percentage of Heads
			double percentTails = (tails/n*100); //Percentage of Tails

			System.out.println("\nPercentage of Heads VS Tails");
			System.out.println("____________________________\n\n");
			System.out.println("Heads is : "+percentHeads+"%");
			System.out.println("Tails is : "+percentTails+"%");
		}
	}

	//2.1 Method to Toss Coin
	public static int cointoss()
	{
		double result = Math.random();//generate random value
		if(result<0.5)
		{
			System.out.println("You flipped Tails !");
			return 1; 
		}
		else
		{
			System.out.println("You flipped Heads !");
			return 0;
		}
	}

	//3. Method to check LeapYear
	/**
	 * 
	 * @param year consist year
	 */

	public static void isLeapYear(int year) 
	{
		int length = Integer.toString(year).length();
		//int length1 = String.valueOf(year1).length();
		if(length<4&&length>4)
		{
			System.err.println("Enter 4 Digit year");
			year=sc.nextInt();
			isLeapYear(year);
		}
		else
		{	/* Leap Year logic->The year completely divided by 4 but not by 100
				the year divided by 400
		 */
			if(year%4==0&&year%100!=0||year%400==0) 
			{
				System.out.println(year+" is a leap year");
			}
			else
			{
				System.out.println(year+" is not a leap year");
			}
		}
	}
}