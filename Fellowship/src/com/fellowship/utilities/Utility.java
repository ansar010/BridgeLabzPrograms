/**************************************************************************************************
 * purpose : Utility class to define all methods
 * 
 * @author Ansar
 * @version 1.2
 * @since 13/12/2018
 **************************************************************************************************/
package com.fellowship.utilities;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;
public class Utility {
	/**
	 * static Scanner and Random class objects to to call inbuilt methods 
	 */
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
			System.out.println("Index["+i+"]->"+a[i]);
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
	//*********************************************************************************************

	//1.Method to replace String
	/**
	 * @param To replace string 
	 */
	static public void replaceString(String username)
	{
		// tmpl_Str variable refers template
		String tmpl_Str = "Hello <<UserName>>, How are you?";

		//To ensure user-name has minimum 3 char
		if(username.length()<3)
		{
			System.err.println("Username should has minimum 3 char");	
		}
		else
		{
			//temp variable refers to temporary variable
			String temp="";

			// substring() method used to get substring of template
			temp += tmpl_Str.substring(0,6);
			temp += username;
			temp += tmpl_Str.substring(18,tmpl_Str.length());
			System.out.println(temp);
		}
	}
	//*********************************************************************************************

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
	//*********************************************************************************************

	//3. Method to check LeapYear
	/**
	 * 
	 * @param year consist year
	 */

	public static void isLeapYear(int year) 
	{
		// length variable hold the length of integer year
		int length = Integer.toString(year).length();

		//int length1 = String.valueOf(year1).length();
		if(length<4&&length>4)
		{
			System.err.println("Enter 4 Digit year");
			year=sc.nextInt();
			isLeapYear(year);
		}
		else
		{	// Leap Year logic->The year completely divided by 4 but not by 100
			//	the year divided by 400

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
	//*********************************************************************************************

	//4. power of n series 
	/**
	 * 
	 * @param n takes power number
	 */
	public static void powerSeries(int n)
	{	
		// Ensures that user given value is less than 31
		if(n<31)
		{
			// loop for traverse n time to calculate power of 2^n
			for(int i=0;i<=n;i++)
			{
				System.out.println("Power of 2^"+i+" = "+pow(2,i));
			}
		}
		else
		{
			System.out.println("n shoud be less than 31...!");
			n=sc.nextInt();
			powerSeries(n);//recursive approach
		}
	}

	//4.1 Method to calculate power of number
	/**
	 * 
	 * @param num takes number
	 * @param p	  takes power 
	 * @return	  return the power value of number
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
	//*********************************************************************************************


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
		//Logic to divide the given number and sum 
		while(i<=n)
		{
			sum += 1.0/i;
			i++;
		}
		return sum;
	}




	//*********************************************************************************************

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
	//*********************************************************************************************

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

	// Another way of finding random distinct coupon Numbers
	/**
	 * 
	 * @param size Number of coupons user want
	 */
	public static void couponNew(int size)
	{
		// Total Number of Iteratioin
		int count=0;

		// Array List to put randomly generated Numbers
		ArrayList<Integer> al = new ArrayList<Integer>();
		ArrayList<Integer> al1 = new ArrayList<>();

		int length=size;

		// To iterate until we get required number of coupons
		while(length!=0){

			// Generating random number based on user requirement
			for(int i=0;i<size;i++)
			{
				int rn = rand.nextInt(size)+1;
				al.add(rn);

				// if arrayList1 doesn't has randomly generated Number Add it
				if(!(al1.contains(rn)))
				{
					al1.add(rn);
					length--;
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
	//*********************************************************************************************

	// 9. To read and Write 2D Array
	/**
	 * 
	 * @param row takes number of rows from user
	 * @param col takes number of columns from user
	 */
	public static void TwoDArr(int row,int col)
	{
		int arr[][]=new int[row][col];
		System.out.println("Enter "+row*col+" Elements in an Array");
		try {
			// Creating Text file obj
			BufferedWriter bw = new BufferedWriter(new FileWriter("/home/admin1/Desktop/ProgFiles/2D.txt"));

			// Logic for @D Array
			for(int i = 0;i<row;i++)
			{
				for(int j=0;j<col;j++)
				{
					// To write Elements in corresponding text File
					bw.write((arr[i][j]=sc.nextInt())+" ");
				}
				bw.newLine();
			}
			System.out.println("Successfully added Elements in 2D array..");
			bw.close();
		} catch (IOException e) {

			e.printStackTrace();
		}
	}
	//*********************************************************************************************

	// 10. Method to print the sum
	/**
	 * 
	 * @param arr user given Array elements
	 * @param length length of an array 
	 */
	public static void tripletsZero(int[] arr,int length) 
	{
		boolean find =false;

		// Loop to traverse over array
		for(int i=0;i<length-2;i++)
		{
			for(int j=i+1;j<length-1;j++)
			{
				// sum of i+j+K
				for(int k=j+1;k<length;k++)
				{
					if(arr[i]+arr[j]+arr[k]==0)
					{
						find=true;
						System.out.println("\n\n{ "+arr[i]+" , "+arr[j]+" , "+arr[k]+" }");

					}					
				}
			}
		}

		if(find==false)
			System.out.println("\n\nNo Triplets sum Zero..");
	}
	//*********************************************************************************************

	// 11.Method to calculate Euclidean distance
	/**
	 * 
	 * @param x command line arguments 
	 * @param y
	 */
	public static void euclideanDistance(int x, int y) 
	{
		// 0.5=1/2 represents root 
		System.out.println("The Euclidean Distance is : "+Math.pow(((x*x)+(y*y)), 0.5));
	}
	//*********************************************************************************************

	// 12. Method to find all possible permutation of String
	/**
	 * 
	 * @param str Given String
	 * @param first first index 
	 * @param last  last index 
	 */
	public static void permutationString(String str, int first, int last)
	{
		// Prints fixed string
		if(first==last)
		{
			System.out.println(str);
		}
		else
		{
			// recursively call methods and fix string 
			for(int i=first;i<=last;i++)
			{
				str=swap(str,first,i);
				permutationString(str,first+1,last);
				str=swap(str,first,i);
			}

		}
	}

	// 12.1 Method to Swap String
	/**
	 * 
	 * @param str Given String
	 * @param firstPos position1
	 * @param secondPos position2
	 * @return swapped string
	 */
	private static String swap(String str, int firstPos, int secondPos)
	{
		// variable temp->to Store first word
		char temp;
		char[] ch = str.toCharArray();
		temp = ch[firstPos];
		ch[firstPos]=ch[secondPos];
		ch[secondPos]=temp;
		return String.valueOf(ch);
	}

	//*********************************************************************************************

	// 13. Method to calculate elapsed time between 

	public static void elapsedTime()
	{
		// total time of start and stop
		long start=0,stop=0;


		while(true)
		{
			System.out.println("Enter 1 to start watch & 0 to stop watch");
			int choice = getInt();

			if(choice==1) {

				// function which give exact time in nano seconds
				start = System.nanoTime();
			}

			if(choice==0)
			{
				stop = System.nanoTime();
				break;
			}
		}

		// converting nano seconds into seconds
		long elapsedTime = (stop-start)/1000000000;

		//System.out.println("The Elapsed time between start and End "+TimeUnit.SECONDS.toSeconds(stop-start));
		System.out.println("The Elapsed time between start time and end time is :"+elapsedTime+"seconds");
	}
	//*********************************************************************************************

	//14. Method to play TictacTeo
	/**
	 * 
	 * @param name takes the name of player2
	 */
	public static void gameTicTacTeo(String name)
	{
		// variable board is an array to initialize play board
		String[] board = new String[9];

		String turn; //player's turn
		String winner=null; // To check who is win 
		String player2; //name of player2

		/**
		 * @param board is an array to initialize board  
		 */ 
		// calling method to load board instruction
		boardInstruction(board);

		player2 =name;
		System.out.println("Board instruction.");
		System.out.println("Enter slot number which u want to occupy.");
		playBoard(board);
		// variable number to get player chosen number slot
		int number;
		turn="0";

		//Iterate until winner decide
		while(winner==null)
		{
			try 
			{
				// Logic to create random number while computer's turn
				if(turn.equalsIgnoreCase("0"))
				{
					Random rn = new Random();
					number =rn.nextInt(10);
					System.out.println("Computer chosed slot Number: "+number);
				}
				else // This else block exist while player2's turn
				{
					//System.out.println(player+" Your turn..!");
					number =Utility.getInt();

				}
				// It checks the given value is valid or not , value should be from 1 to 9
				if(!(number>0&&number<=9)) 
				{
					System.out.println("Invalid Input..!");
					continue;
				}
			}
			catch(InputMismatchException ie)
			{
				System.out.println("Enter valid Number");
				continue;
			}

			// It checks if the user given number and board's number is equal
			// It replace the number by player's symbol
			if(board[number-1].equals(String.valueOf(number)))
			{
				board[number-1]=turn;

				if(turn.equals("X"))
					turn="0";
				else
					turn="X";
				// Calling method to show updated playBoard
				playBoard(board);

				//Calling checkWinner Method to get winner name
				/**
				 * @param turn player's turn 
				 * @param player2 name of second player
				 * return winner 
				 */
				winner=checkWinner(board,turn,player2);	
			}
			else
			{
				System.out.println("Slot already occupied...! Chose different slot");
				continue;
			}
		}
		if(winner.equals("Draw"))
			System.out.println("Game is Draw1..!  Thanks for Playing..");
		else {

			if(winner.equals("X"))
				System.out.println("\tCongratulations "+player2+" You Won the Game");
			else
				System.out.println("\tcomputer Won the Game..!");

		}
	}

	/**
	 * 
	 * @param board an array of a board
	 * @param turn player's turn
	 * @param player2 name of second player
	 * @return it returns who is win. 
	 */
	private static String checkWinner(String[] board,String turn,String player2) 
	{	
		// Iterate until all winning possibilities check
		// variable possibility indicate the possible way 
		for (int possibility = 0; possibility < 8; possibility++) {

			// variable line result of game 
			String line=null;
			switch(possibility)
			{
			case 0:
				line=board[0]+board[1]+board[2];
				break;
			case 1:
				line=board[3]+board[4]+board[5];
				break;
			case 2:
				line=board[6]+board[7]+board[8];
				break;
			case 3:
				line=board[0]+board[3]+board[6];
				break;
			case 4:
				line=board[1]+board[4]+board[7];
				break;
			case 5:
				line=board[2]+board[5]+board[8];
				break;
			case 6:
				line=board[0]+board[4]+board[8];
				break;
			case 7:
				line=board[2]+board[4]+board[6];
				break;
			}
			//Check whose symbol is in line
			if(line.equals("XXX"))
				return "X";
			else if(line.equals("000"))
				return "0";
		}
		//Iterate and check any slot is empty
		for (int i = 0; i < 9; i++) {
			// here calling asList() method presents in arrays to take our array as list
			// To utilize in-built "contains()" method 
			if(Arrays.asList(board).contains(String.valueOf(i+1)))
				break;

			// if all slot filled match draw
			else if(i==8)
				return "draw";
		}

		//condition to change player's turn
		if(turn.equals("X"))
			System.out.println(player2 + "'s turn; enter a slot number to place " + turn + " in:");
		return null;
	}

	/**
	 * This method print the updated board
	 * @param board an array of board
	 */
	private static void playBoard(String[] board) 
	{

		System.out.println("\n\t"+board[0]+" | "+board[1]+" | "+board[2]);
		System.out.println("\t"+"---------");
		System.out.println("\t"+board[3]+" | "+board[4]+" | "+board[5]);
		System.out.println("\t"+"---------");
		System.out.println("\t"+board[6]+" | "+board[7]+" | "+board[8]);
	}

	/**
	 * This Method initialize the respective slot numbers
	 * @param board an array of board
	 */
	private static void boardInstruction(String[] board)
	{	// Iterate and show respective slot number to place player's symbol
		for(int i = 0;i<9;i++)
		{
			board[i]=String.valueOf(i+1);
		}


	}
	//*********************************************************************************************

	//15. Method to find root1 and root2 of x
	/**
	 * 
	 * @param a takes the value of a
	 * @param b takes the value of b
	 * @param c takes the value of c
	 */
	public static void quadratic(int a, int b, int c)
	{
		// variable delta is (b square-4ab) 
		int delta = b*b-4*a*c;
		// variable root1 holds the x's root1 
		double root1=(-b+Math.sqrt(delta))/(2*a);
		// variable root2 holds the x's root2
		double root2=(-b-Math.sqrt(delta))/(2*a);
		System.out.println("Given Quadratic Equation is : "+a+"*x*x+"+ b+"*x+" + c);
		System.out.println("\n**************RESULT*******************");
		System.out.println("First Root  :"+root1);
		System.out.println("Second Root :"+root2);

	}
	//*********************************************************************************************

	//16. Method to take temperature and speed value and give windChill value
	/**
	 * 
	 * @param t temperature value
	 * @param v speed
	 * @return windChill 
	 */
	public static double windChill(double t, double v) 
	{
		double windchill = 35.74+0.6215*t+(0.4275*t-35.75)*Math.pow(v, 0.16);
		return windchill;
	}
	//*********************************************************************************************//
	//##########################################ALGORITHMS#########################################//
	//*********************************************************************************************//

	//Method to check the Number is Prime or not
	/**
	 * 
	 * @param n to get number from user
	 * @return true if number is prime else false
	 */
	private static boolean isPrime(int n) 
	{	//divide given number 
		for(int i=2;i<=n/2;i++)
		{
			if(n%i==0)
				return false;
		}

		return true;
	}

	// Method to Check the Number is Palindrome or Not 
	/**
	 * It checks the given number is palindrome or not
	 * @param number takes number from user
	 * @return true if number is palindrome else false
	 */
	public static boolean isNumberPalindrome(int number)
	{	
		int temp=number;
		int result=0;
		while(number!=0)
		{
			int remainder=number%10;
			result=result*10+remainder;
			number=number/10;
		}

		return temp==result;
	}

	//Method to check the given string is palindrome or not
	/**
	 * 
	 * @param string takes String from the user
	 * @return return true if string is palindrome else false
	 */
	public static boolean isStringPalindrome(String string)
	{	//Starting index of string
		int i = 0;
		//iterate until index reach half of the string
		while(i<string.length()/2)
		{
			if(string.charAt(i)!=string.charAt(string.length()-1-i))
				return false;
			i++;
		}
		return true;
	}
	// Method to return the day Number 
	/**
	 * 
	 * @param day takes date from user
	 * @param month takes month number from user
	 * @param year takes year number from user
	 * @return It returns the Day number on the given date
	 */
	public static int dayOfWeek(int day, int month, int year) 
	{
		int y0 = ((year - (14 - month) / 12));
		int x  = (y0 + y0/4-y0/100 + y0/400);
		int m0 = (month+ 12 * ((14 - month) / 12) - 2);
		int d0 = (((day + x + 31*m0	/ 12) % 7));
		return d0;
	}
	//*********************************************************************************************

	// Method to check Anagram
	/**
	 * 
	 * @param firstString takes first String from user
	 * @param secondString takes second String from user
	 */
	public static void isAnagram(String firstString, String secondString) 
	{
		//removing Spaces from given String to compare
		String firstWord  = firstString.replaceAll("\\s", "");
		String secondWord = secondString.replaceAll("\\s", "");

		//Check if the given string's length is equal or not
		if(firstWord.length()!=secondWord.length())
		{
			System.out.println("Both String length is not same since it's not Anagram");
		}
		else
		{	// variable s1 and s2  sorted String
			String s1=sortingString(firstString);
			String s2=sortingString(secondWord);
			// It checks given strings equal or not 
			if(s1.equalsIgnoreCase(s2))
			{
				System.out.println("String "+firstString+" and "+secondString+" is Anagram");
			}
			else
			{
				System.out.println("String "+firstString+" and "+secondString+" is Not Anagram");
			}
		}

	}
	//*********************************************************************************************

	//Method to Sort String
	/**
	 * 
	 * @param str takes string from user
	 * @return returns the sorted string
	 */
	public static String sortingString(String str)
	{
		char chArr[]=str.toCharArray();
		Arrays.sort(chArr);
		return new String(chArr);
	}

	// Method to perform insertion sort on integer
	/**
	 * 
	 * @param arr takes integer array 
	 */
	public static void insertionSortInt(int arr[])
	{	//Length of an array
		int length=arr.length;

		//Iterate until all elements sorted 
		for(int i=1; i<length;i++)
		{	//variable j is previous position/hole position where value to be insert
			int j=i-1;

			// key is temporary variable that holds value to be inserted 
			int key=arr[i];

			/* Move elements of arr[0..i-1], that are 
            greater than key, to one position ahead 
            of their current position */
			while(j>=0&&arr[j]>key)
			{	
				//swap the value which is greater than current value
				arr[j+1]=arr[j];

				//Decrementing j to point previous position
				j=j-1;
			}
			//sorting based on ascending order
			arr[j+1]=key;
		}
	}

	//Method of insertion sort for String
	/**
	 * 
	 * @param string takes string array
	 */
	public static void stringInsertionSort(String string[])
	{
		int length = string.length;
		for(int i=1;i<length;i++)
		{	//j place to insert value
			int j=i-1;
			//key holds inserted value
			String key=string[i];
			//check comparison from start to end 
			while(j>=0&&string[j].compareToIgnoreCase(key)>0)
			{	//Swapping
				string[j+1]=string[j];
				j=j-1;
			}
			//sorted based on ascending order
			string[j+1]=key;
		}
	}
	// Method for BubbleSort
	public static int binarySearchInt(int[] elements,int length,int x)
	{

		return 0;
	}
}