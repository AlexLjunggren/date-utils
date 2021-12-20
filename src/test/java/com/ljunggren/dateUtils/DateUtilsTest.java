package com.ljunggren.dateUtils;

import static org.junit.Assert.*;

import java.text.ParseException;
import java.util.Date;

import org.junit.Test;

public class DateUtilsTest {
    
    @Test
    public void toDateTest() throws ParseException {
        Date date = DateUtils.toDate("2021-12-01", "yyyy-MM-dd");
        assertEquals(2021, DateUtils.getYear(date));
        assertEquals(12, DateUtils.getMonth(date));
        assertEquals(1, DateUtils.getDay(date));
    }

    @Test
    public void toStringTest() throws ParseException {
        String pattern = "yyyy-MM-dd";
        String dateString = "2021-12-01";
        Date date = DateUtils.toDate("2021-12-01", pattern);
        String toString = DateUtils.toString(date, pattern);
        assertEquals(dateString, toString);
    }
    
    @Test
    public void getYearTest() throws ParseException {
        Date date = DateUtils.toDate("2021-12-01", "yyyy-MM-dd");
        int year = DateUtils.getYear(date);
        assertEquals(2021, year);
    }
    
    @Test
    public void getMonthTest() throws ParseException {
        Date date = DateUtils.toDate("2021-12-01", "yyyy-MM-dd");
        int month = DateUtils.getMonth(date);
        assertEquals(12, month);
    }

    @Test
    public void getDayTest() throws ParseException {
        Date date = DateUtils.toDate("2021-12-01", "yyyy-MM-dd");
        int month = DateUtils.getDay(date);
        assertEquals(1, month);
    }
    
    @Test
    public void getHourTest() throws ParseException {
        Date date = DateUtils.toDate("2021-12-01 13:45:30", "yyyy-MM-dd HH:mm:ss");
        int hour = DateUtils.getHour(date);
        assertEquals(13, hour);
    }
    
    @Test
    public void getMinuteTest() throws ParseException {
        Date date = DateUtils.toDate("2021-12-01 13:45:30", "yyyy-MM-dd HH:mm:ss");
        int minute = DateUtils.getMinute(date);
        assertEquals(45, minute);
    }
    
    @Test
    public void getSecondTest() throws ParseException {
        Date date = DateUtils.toDate("2021-12-01 13:45:30", "yyyy-MM-dd HH:mm:ss");
        int second = DateUtils.getSecond(date);
        assertEquals(30, second);
    }
    
    @Test
    public void addYearsTest() throws ParseException {
        Date date = DateUtils.toDate("2021-12-01", "yyyy-MM-dd");
        Date updated = DateUtils.addYears(date, -2);
        assertEquals(2019, DateUtils.getYear(updated));
    }

    @Test
    public void addMonthsTest() throws ParseException {
        Date date = DateUtils.toDate("2021-12-01", "yyyy-MM-dd");
        Date updated = DateUtils.addMonths(date, 3);
        assertEquals(3, DateUtils.getMonth(updated));
        assertEquals(2022, DateUtils.getYear(updated));
    }
    
    @Test
    public void addWeeksTest() throws ParseException {
        Date date = DateUtils.toDate("2021-12-01", "yyyy-MM-dd");
        Date updated = DateUtils.addWeeks(date, 5);
        assertEquals(5, DateUtils.getDay(updated));
        assertEquals(1, DateUtils.getMonth(updated));
        assertEquals(2022, DateUtils.getYear(updated));
    }
    
    @Test
    public void addDaysTest() throws ParseException {
        Date date = DateUtils.toDate("2021-12-01", "yyyy-MM-dd");
        Date updated = DateUtils.addDays(date, 31);
        assertEquals(1, DateUtils.getDay(updated));
        assertEquals(1, DateUtils.getMonth(updated));
        assertEquals(2022, DateUtils.getYear(updated));
    }

    @Test
    public void addHoursTest() throws ParseException {
        Date date = DateUtils.toDate("2021-12-01 13:45:30", "yyyy-MM-dd HH:mm:ss");
        Date updated = DateUtils.addHours(date, 2);
        assertEquals(15, DateUtils.getHour(updated));
    }
    
    @Test
    public void addMinutesTest() throws ParseException {
        Date date = DateUtils.toDate("2021-12-01 13:45:30", "yyyy-MM-dd HH:mm:ss");
        Date updated = DateUtils.addMinutes(date, 15);
        assertEquals(14, DateUtils.getHour(updated));
        assertEquals(0, DateUtils.getMinute(updated));
    }
    
    @Test
    public void addSecondsTest() throws ParseException {
        Date date = DateUtils.toDate("2021-12-01 13:45:30", "yyyy-MM-dd HH:mm:ss");
        Date updated = DateUtils.addSeconds(date, 45);
        assertEquals(46, DateUtils.getMinute(updated));
        assertEquals(15, DateUtils.getSecond(updated));
    }
    
}
