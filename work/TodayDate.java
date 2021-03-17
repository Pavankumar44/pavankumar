package com.ticket.book;

import java.time.LocalDate;
import java.time.MonthDay;

public class TodayDate {

	public static void main(String[] args) {
		
		LocalDate today=LocalDate.now();
		LocalDate birthday= LocalDate.of(2021, 03, 11);
		MonthDay birth=MonthDay.of(birthday.getMonthValue(), birthday.getDayOfMonth());;
		MonthDay current=MonthDay.from(today);
		if(birth.equals(current))
		{
			System.out.printf("Today %s and birthday %s are same dates %n",today,birthday);

		}
		else
		{
			System.out.printf("Dates are not same");
			
		}
		
	

		
	}

}
