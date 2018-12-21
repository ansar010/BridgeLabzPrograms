/**
 * purpose : To create a program for TicTacToe Game , Computer will be player 1 .
 * 
 * @author Ansar
 * @version 1.2
 * @since 21/12/2018
 * 
 */
package com.fellowship.funtional;
import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Random;

import com.fellowship.utilities.Utilities;
public class TTT 
{
	// An array for initialize the board
	static String[] board = new String[9];
	
	
	static String player2,turn,winner=null;


	public static void main(String args[])
	{
		System.out.println("Start the game..!");	
		System.out.println("Welcome to the TicTacToe Game");
		System.out.println("-----------------------------");
		boardInstruction();
		System.out.println("player 1 will be the computer and it's Symbol is : 0");
		System.out.println("Enter the Name of the player 2");
		player2 =Utilities.getLine();
		System.out.println("Board instruction.");
		System.out.println("Enter slot number which u want to occupy.");
		playBoard();
		int number;
		turn="0";
		while(winner==null)
		{
			try 
			{
				if(turn.equalsIgnoreCase("0"))
				{
					Random rn = new Random();
					number =rn.nextInt(10);
					int temp=number;
					System.out.println("Computer chosed "+number+"th slot");
				}
				else
				{
					//System.out.println(player+" Your turn..!");
					number =Utilities.getInt();

				}
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
			if(board[number-1].equals(String.valueOf(number)))
			{
				board[number-1]=turn;

				if(turn.equals("X"))
					turn="0";
				else
					turn="X";

				playBoard();
				winner=checkWinner();	
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
				System.out.println(player2+" is Win");
			else
				System.out.println("computer is Win");
		}
	}
	private static String checkWinner() {
		for (int i = 0; i < 8; i++) {
			String line=null;
			switch(i)
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
			if(line.equals("XXX"))
				return "X";
			else if(line.equals("000"))
				return "0";
		}

		for (int i = 0; i < 9; i++) {
			if(Arrays.asList(board).contains(String.valueOf(i+1)))
				break;
			else if(i==8)
				return "draw";
		}
		if(turn.equals("X"))
			System.out.println(player2 + "'s turn; enter a slot number to place " + turn + " in:");
		return null;
	}
	private static void playBoard() 
	{

		System.out.println("\n\t"+board[0]+" | "+board[1]+" | "+board[2]);
		System.out.println("\t"+"---------");
		System.out.println("\t"+board[3]+" | "+board[4]+" | "+board[5]);
		System.out.println("\t"+"---------");
		System.out.println("\t"+board[6]+" | "+board[7]+" | "+board[8]);
	}

	private static void boardInstruction()
	{

		for(int i = 0;i<9;i++)
		{
			board[i]=String.valueOf(i+1);
		}
	}
}


