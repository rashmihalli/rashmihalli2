package com.rashmi.service;

public class DateDifferenceProvider 
{
	static final int JAN = 31;
	static final int FEB = 28;
	static final int MAR = 31;
	static final int APR = 30;
	static final int MAY = 31;
	static final int JUN = 30;
	static final int JUL = 31;
	static final int AUG = 31;
	static final int SEP = 30;
	static final int OCT = 31;
	static final int NOV = 30;
	static final int DEC = 31;
	
	/*static final int LeapYear = 366;
	static final int NonLeapYear = 365;*/
	
	static int[] months = {JAN,FEB,MAR,APR,MAY,JUN,JUL,AUG,SEP,OCT,NOV,DEC};
	
	public static int getDateDifference(MyDate startDate, MyDate endDate)
	{
		
		if(sameDate(startDate,endDate) && sameMonth(startDate,endDate) && sameYear(startDate,endDate)){

			return 0;
		}
		
		else if(sameMonth(startDate,endDate) && sameYear(startDate,endDate)){

			return endDate.getDd()-startDate.getDd();
		}
		
		else if(sameYear(startDate,endDate) && !sameMonth(startDate,endDate)){

			return remainingDaysofMonth(startDate)+ endDate.getDd()+interviningDaysofMonth(startDate,endDate); 
		}
		
		else{
			return   remainingDaysofMonth(startDate) + NoofDaysInYear(startDate, endDate)+ interviningDaysofMonth1(startDate)+LeadingYear(endDate)- remainingDaysofMonth(endDate); 
		
		}
		
	}

	
	private static boolean sameYear(MyDate startDate, MyDate endDate) 
	{
		return startDate.getYyyy() == endDate.getYyyy();
	}

	private static boolean sameMonth(MyDate startDate, MyDate endDate) 
	{
		return startDate.getMm() == endDate.getMm();
	}

	private static boolean sameDate(MyDate startDate, MyDate endDate) 
	{
		return startDate.getDd() == endDate.getDd();
	}
	
	private static int remainingDaysofMonth(MyDate Date)
	{
		return months[Date.getMm()-1]-Date.getDd();
	}
	
	private static int interviningDaysofMonth(MyDate startDate, MyDate endDate)
	{
		int totalDays = 0;
		for(int index=startDate.getMm()+1; index<endDate.getMm(); index++)
		{
			totalDays = totalDays+months[index-1];
		}
		return totalDays;
	}
	
	private static int NoofDaysInYear(MyDate startDate, MyDate endDate)
	{
		int remainDays = 0;
		for(int index=startDate.getYyyy()+1; index<endDate.getYyyy(); index++)
		{
			if(checkLeapYear(startDate) && )
			{
				remainDays = remainDays + 366;
			}
			remainDays = remainDays + 365; 
		}
		return remainDays;
	}
	
	private static int LeadingYear(MyDate endDate)
	{
		int leadingDays = 0;
		
		for(int index=0; index< endDate.getMm(); index++ )
		{
			leadingDays = leadingDays + months[index];
		}
		return leadingDays;
	}
	
	private static int interviningDaysofMonth1(MyDate startDate)
	{
		int totalDays = 0;
		for(int index=startDate.getMm()+1; index<=12; index++)
		{
			totalDays = totalDays+months[index-1];
		}
		return totalDays;
	}
	
	private static boolean checkLeapYear(MyDate Date)
	{
		if((Date.getYyyy())%4==0 || ((Date.getYyyy())%100==0 && (Date.getYyyy())%400==0))
		
			return true;
		else
		    return false;
		
	}
	

}
