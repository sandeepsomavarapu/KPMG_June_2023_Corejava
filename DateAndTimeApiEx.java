package com.kpmg.java8;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class DateAndTimeApiEx {

	public static void main(String[] args) {

		LocalDate localdate = LocalDate.now();// imuttable
		System.out.println(localdate);
		System.out.println(localdate.plusDays(1));
		System.out.println(localdate.getDayOfMonth());
		System.out.println(localdate.getDayOfYear());
		System.out.println(localdate.getMonthValue());

		LocalTime localtime = LocalTime.now();
		System.out.println(localtime);
		System.out.println(localtime.getHour());
		System.out.println(localtime.getMinute());
		System.out.println(localtime.getSecond());

		LocalDateTime ldtime = LocalDateTime.now();
		System.out.println(ldtime);
		LocalDateTime dateTime=LocalDateTime.of(1993,8,10,10,45);
		System.out.println(dateTime);
		
		LocalDate date=LocalDate.now();//systemdate
		LocalDate bDate=LocalDate.of(1993,11,10);
		Period p=Period.between(bDate,date);
		System.out.printf("ur age %d years,%d months,%d days",p.getYears(),p.getMonths(),p.getDays());
		System.out.println();
		ZoneId zone=ZoneId.of("America/New_York");
		ZonedDateTime zt=ZonedDateTime.now(zone);
		System.out.println(zt);//Asia/Calcutta

	}

}
