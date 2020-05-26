package com.sample;

import org.kie.api.time.Calendar;
import org.quartz.impl.calendar.WeeklyCalendar;

// A class to act as a converter from Quartz Calendar to Drools Calendar
public class CalendarWrapper implements Calendar {
	private WeeklyCalendar cal;

	public CalendarWrapper(WeeklyCalendar cal) {
		this.cal = cal;
	}

	public boolean isTimeIncluded(long timestamp) {
		return cal.isTimeIncluded(timestamp);
	}

	public static void main(String[] args) {
  }
}