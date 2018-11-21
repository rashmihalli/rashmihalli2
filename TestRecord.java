package com.rashmi.test;

import com.rashmi.service.*;

public class TestRecord 
{
	MyDate startDate;
	MyDate endDate;
	int ActualDifference;
	
	public TestRecord(MyDate startDate, MyDate endDate, int actualDifference) 
	{
		super();
		this.startDate = startDate;
		this.endDate = endDate;
		ActualDifference = actualDifference;
	}

	public MyDate getStartDate() {
		return startDate;
	}

	public void setStartDate(MyDate startDate) {
		this.startDate = startDate;
	}

	public MyDate getEndDate() {
		return endDate;
	}

	public void setEndDate(MyDate endDate) {
		this.endDate = endDate;
	}

	public int getActualDifference() {
		return ActualDifference;
	}

	public void setActualDifference(int actualDifference) {
		ActualDifference = actualDifference;
	}
	
	

}
