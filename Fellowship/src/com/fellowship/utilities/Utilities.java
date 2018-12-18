/**
 * purpose : Utility class to define all methods
 * 
 * @author Ansar
 * @version 1.2
 * @since 13/12/2018
 */
package com.fellowship.utilities;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Random;
import java.util.Scanner;
public class Utilities {

	static Scanner sc = new Scanner(System.in);
	static Random rand = new Random();

	/**
	 * Method to get char from user
	 */
	public static char getChar() 
	{
		char ch = sc.next().charAt(0);
		return ch;
	}

	/** 
	 * Method to get word from String  
	 */
	public static String getWord() 
	{
		String word = sc.next();
		return word;
	}

	/**
	 * Method to get String as line
	 */
	public static String getLine()
	{
		String str = sc.nextLine();
		return str;
	}

	/**
	 * Method to get integer as input
	 */
	public static int getInt()
	{
		int i = sc.nextInt();
		return i;
	}

	/**
	 * Method to get Long as input
	 */
	public static Long getLong()
	{
		long l = sc.nextLong();
		return l;
	}

	/**
	 * Method to Get float as input
	 */
	public static float getFloat()
	{
		float f = sc.nextFloat();
		return f;
	}

	/**
	 * Method to get double as input
	 */
	public static double getDouble()
	{
		Double d = sc.nextDouble();
		return d;
	}
	/**
	 * Method to create and insert element in integer OneDimensional array
	 */
	public static int[] createIntArr()
	{
		//System.out.println("Enter size of an Array..");
		int s = getInt();
		int[] arr = new int[s];
		System.out.println("Enter "+s+" elements ");
		for(int i = 0;i<arr.length;i++)
		{
			arr[i]=getInt();
		}
		return arr;
	}

	/**
	 * Method to Dispaly oneDimenstional Array
	 */
	public static void displayArr(int a[])
	{
		for(int i=0;i<a.length;i++)
		{
			System.out.println(" "+a[i]+" ");
		}
	}
	/**
	 * Method to create String and insert elements in String 1D array 
	 */
	public static void createStrArr()
	{
		System.out.println("Enter size of an Array..");
		int s = getInt();
		String arr[] = new String[s];
		System.out.println("Enter "+s+" elements ");
		for(int i = 0;i<arr.length;i++)
		{
			arr[i]=getWord();
		}
	}

	/*/**
	 * Method to create char array
	 *
	public static char[] createCharArr()
	{

			System.out.println("Enter size of an Array..");
			int s = getInt();
			char arr[] = new char[s];
			return arr;

	}*/

	/**
	 * Method to create and insert elements in double 1D array
	 */
	public static void createDoubleArr()
	{
		System.out.println("Enter size of an Array..");
		int s = getInt();
		double arr[] = new double[s];
		System.out.println("Enter "+s+" elements ");
		for(int i = 0;i<arr.length;i++)
		{
			arr[i]=getDouble();
		}
	}



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
	//*******************************************************************************

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
				System.out.println(year+" is a leap year.");
			}
			else
			{
				System.out.println(year+" is not a leap year.");
			}
		}
	}
	//*******************************************************************************

	//4. power of n series 
	/**
	 * 
	 * @param n takes power number
	 */
	public static void powerSeries(int n)
	{
		if(n<31)
		{
			for(int i=0;i<=n;i++)
			{
				System.out.println("Power of 2^"+i+" = "+pow(2,i));
			}
		}
		else
		{
			System.out.println("n shoud be less than 31...!");
			n=sc.nextInt();
			powerSeries(n);//recur
		}
	}

	//4.1 Method to calculate power of num
	/**
	 * 
	 * @param num takes number
	 * @param p	  takes power 
	 * @return	  return the the power value of num
	 */
	public static int pow(int num,int p)
	{
		int result=1; //result to calculate power value
		while(p!=0) //Condition to multiply number until power value become zero
		{
			result*=num; 
			p--; //Decrementing power value 
		}
		return result;
	}
	//**************************************************************************************


	//5. Method to print Nth Harmonic value
	/**
	 * 
	 * @param n takes Nth value from user
	 */
	public static void nHarmonicValue(int n)
	{
		if(n!=0) // condition to loop until n zero
		{
			for(int i=1;i<=n;i++)
			{
				if(i<n) 
					System.out.print("1/"+i+" + ");
				if(i==n)
					System.out.print("1/"+i);
			}
			System.out.print(" = "+harmonicSeries(n));

		}
		else
		{
			System.out.println("n value shoud be greater than 0..!");
			n=sc.nextInt();
			nHarmonicValue(n); // recursively calling same method until user give valid input
		}
	}

	//5.1 Method to calculate harmonic Nth number
	/**
	 * 
	 * @param n takes Nth value
	 * @return return harmonic value of given number
	 */
	private static double harmonicSeries(int n)
	{

		double i=1,sum=0.0; 
		//Logic to divide the given num and sum 
		while(i<=n)
		{
			sum += 1.0/i;
			i++;
		}
		return sum;
	}




	//********************************************************************************************

	//6. Prime Factorization
	/**
	 * 
	 * @param num To get number from user
	 */
	public static void primeFactorization(long num) 
	{
		System.out.print("Prime factors of "+num+" : ");
		//for(long i=2;i*i<=num;i++)

		// num/i -> to divide given number for further itreation
		for(long i=2;i<=num/i;i++) 
		{
			// Checking condition and prints prime factor
			while(num%i==0)
			{
				num=num/i;
				System.out.print(i+" ");
			}
		}

		//To Print Print factor of last remaining digit
		if(num>1)
		{
			System.out.print(num);
		}
	}

	//Method to check the Number is Prime or not
	/**
	 * 
	 * @param n to get number from user
	 * @return true if number is prime else false
	 */
	private static boolean isPrime(int n) 
	{
		for(int i=2;i<=n/2;i++)
		{
			if(n%i==0)
				return false;
		}

		return true;
	}
	//****************************************************************************************

	//7. Method to stimulate the gambler
	/**
	 * 
	 * @param $stak gamblers initial amount
	 * @param $goal gamblers desired amount
	 * @param numOfTimes Number of trials 
	 */
	public static void playGame(int $stak, int $goal, int numOfTimes)
	{
		int win=0;  // Total Numbers of game won

		int bets=0; // Total Number of bets made

		int loss=0; // Total Number of game loss

		// Iteration based on trails 
		for(int trials=0;trials<numOfTimes;trials++)
		{
			//Stimulating Gambler
			int cash=$stak;
			while(cash>0 && cash<$goal)
			{
				bets++;

				if(Math.random()<0.5)
					cash++; //win 1$

				else
					cash--; //Loss 1$

			}
			if(cash==$goal) // Condition to check is Gambler reached to goal
				win++;
			else
				loss++;
		}

		// Result
		System.out.println("\n\tResult..");
		System.out.println("\t--------");

		double wins=100.0*win/numOfTimes,los=100.0*loss/numOfTimes;
		System.out.println("\nWins "+win+" out of "+numOfTimes+" trials.");
		System.out.println("Percentage of Wins : "+wins+"%");

		System.out.println("\nLoss "+loss+" out of "+numOfTimes+" trials.");
		System.out.println("Percentage of Loss : "+los+"%");
		//System.out.println("Bet Price is : "+bets);
		System.out.println("\nAverage bets : "+1.0*bets/numOfTimes);	
	}
	//*********************************************************************************************

	// 8. To find Number of iteration to find distinct coupon
	/**
	 * 
	 * @param coupons takes user entered array elements 
	 * @return number of iteration taken for distinct coupons
	 */
	public static int totalIterations(int[] coupons) 
	{
		// Total number of counts and length of array
		int count=0,length=coupons.length;

		// iterates until lengths become 0
		while(length!=0)
		{
			// Generate random number with in 10
			int rno = rand.nextInt(10);

			for(int i = 0; i<length;i++)
			{
				// check randomly generated number = user's coupon number 
				count++;
				if(rno==coupons[i])
				{
					// Eliminating duplicate element by replacing last element
					coupons[i]=coupons[length-1];
					length--;
					break;
				}
			}
		}

		return count;			
	}

	
	public static void couponNew(int size)
	{
		int count=0;
		ArrayList<Integer> al = new ArrayList<Integer>();
		ArrayList<Integer> al1 = new ArrayList<>();
		int length=size;

		while(length!=0){		
			for(int i=0;i<size;i++)
			{
			int rn = rand.nextInt(size)+1;
			al.add(rn);
			
				if(!(al1.contains(rn)))
				{
					al1.add(rn);
					length--;
					//count++;
				}
				
			count++;
			}
			//length--;
		}
		System.out.println("Randomly Generated Numbers");
		System.out.println(al);
		System.out.println("Distinct Coupon Numbers");
		System.out.println(al1);
		System.out.println("number of iteration is "+count);
	}
	//*******************************************************************************************

}