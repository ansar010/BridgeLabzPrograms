package com.fellowShip.AlgorithmsProgs;

import com.fellowship.utilities.Utilities;

public class DayOfWeekRunner 
{
	public static void main(String[] args)
	{
		System.out.println("Enter date month and Year in Command line argument");
		int day = Integer.parseInt(args[0]);
		int month = Integer.parseInt(args[1]);
		int year = Integer.parseInt(args[2]);
		String days[]= {"Sunday","Monday","TuesDay","WednessDay","ThursDay","FriDay","SaturDay"};
		int dayname=Utilities.dayOfWeek(day,month,year);
		System.out.println("The Day of given date "+day+"/"+month+"/"+year+" is : "+days[dayname]);
	}
}
