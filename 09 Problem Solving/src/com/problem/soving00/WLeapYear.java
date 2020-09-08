package com.problem.soving00;

import java.util.Calendar;

public class WLeapYear {
	public static void main(String[] args) {
		int year = 2020;
		Calendar cal = Calendar.getInstance();
		cal.set(Calendar.YEAR, year);
		int noOfDays = cal.getActualMaximum(Calendar.DAY_OF_YEAR);
		if (noOfDays == 366) {
			System.out.println("Given Year is the leap Year");
		} else {
			System.out.println("Given Year is not the leap year!!");
		}
		System.out.println(isLeapYear(year));
	}
	
	public static boolean isLeapYear(int year) {
		boolean leapStatus = false;
		if (year % 4 == 0) {
			if (year % 100 == 0) {
				if (year % 400 == 0) {
					leapStatus = true;
				}else {
					leapStatus=false;//Not required default is false
				}
			} else {
				leapStatus = true;
			}
		}
		return leapStatus;
	}
}
/*

1. If the year is evenly divisible by 4, go to step 2. Otherwise, go to step 5.
2. If the year is evenly divisible by 100, go to step 3. Otherwise, go to step 4.
3. If the year is evenly divisible by 400, go to step 4. Otherwise, go to step 5.
4. The year is a leap year (it has 366 days).
5. The year is not a leap year (it has 365 days). Source of these steps.

*/