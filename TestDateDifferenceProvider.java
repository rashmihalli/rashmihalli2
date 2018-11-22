package com.rashmi.test;

import com.rashmi.service.*;

public class TestDateDifferenceProvider 
{
	public static void main(String[] args) 
	{
		TestRecord[] TestRecords = new TestRecord[6];
		
		TestRecords[0] = new TestRecord(new MyDate(04,06,2011), new MyDate(04,06,2011), 0);
		TestRecords[1] = new TestRecord(new MyDate(06,04,2018), new MyDate(18,04,2018), 12);
		TestRecords[2] = new TestRecord(new MyDate(06,04,2011), new MyDate(18,05,2011), 42);
		TestRecords[3] = new TestRecord(new MyDate(06,04,2011), new MyDate(18,06,2011), 73);
		TestRecords[4] = new TestRecord(new MyDate(06,04,2011), new MyDate(18,12,2011), 256);
		TestRecords[5] = new TestRecord(new MyDate(06,04,2011), new MyDate(18,12,2012), 621);
		
		for(TestRecord TestRec: TestRecords)
		{
			int calculateDifference= DateDifferenceProvider.getDateDifference(TestRec.getStartDate(), TestRec.getEndDate());
			if(TestRec.getActualDifference()==calculateDifference)
			{
				System.out.println("Test Passed");
			}
			else
			{
				System.err.println("Test Failed  " +"difference that we got  "+calculateDifference);
			}
		}
		
	}

}
