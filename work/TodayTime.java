package com.ticket.book;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class TodayTime {

	public static void main(String[] args) {
		LocalDate today=LocalDate.now();
        LocalDate previous=today.minus(1, ChronoUnit.YEARS);
        LocalDate next=today.plus(1, ChronoUnit.YEARS);
        System.out.println("previous Years' date is :"+previous);
        System.out.println("Today's date is :"+today);
        System.out.println("1 Year Later date is :"+next);
		

	}

}
