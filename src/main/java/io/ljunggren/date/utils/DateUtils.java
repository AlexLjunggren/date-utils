package io.ljunggren.date.utils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Year;
import java.util.Date;

import org.joda.time.Days;
import org.joda.time.Hours;
import org.joda.time.LocalDate;
import org.joda.time.LocalDateTime;
import org.joda.time.Minutes;
import org.joda.time.Months;
import org.joda.time.Seconds;
import org.joda.time.Weeks;
import org.joda.time.Years;

public class DateUtils {
    
    public static Date toDate(String dateString, String pattern) throws ParseException {
        SimpleDateFormat formatter = new SimpleDateFormat(pattern);
        return formatter.parse(dateString);
    }

    public static String toString(Date date, String pattern) {
        SimpleDateFormat formatter = new SimpleDateFormat(pattern);
        return formatter.format(date);
    }
    
    public static int getYear(Date date) {
        return new LocalDateTime(date).getYear();
    }
    
    public static int getMonth(Date date) {
        return new LocalDateTime(date).getMonthOfYear();
    }
    
    public static int getDay(Date date) {
        return new LocalDateTime(date).getDayOfMonth();
    }
    
    public static int getHour(Date date) {
        return new LocalDateTime(date).getHourOfDay();
    }
    
    public static int getMinute(Date date) {
        return new LocalDateTime(date).getMinuteOfHour();
    }
    
    public static int getSecond(Date date) {
        return new LocalDateTime(date).getSecondOfMinute();
    }
    
    public static boolean isAM(Date date) {
        return getHour(date) < 12;
    }
    
    public static boolean isPM(Date date) {
        return !isAM(date);
    }
    
    public static String getDayOfWeekString(Date date) {
        return new LocalDate(date).dayOfWeek().getAsText();
    }
    
    public static Date addYears(Date date, int years) {
        return new LocalDateTime(date).plusYears(years).toDate();
    }

    public static Date addMonths(Date date, int months) {
        return new LocalDateTime(date).plusMonths(months).toDate();
    }
    
    public static Date addWeeks(Date date, int weeks) {
        return new LocalDateTime(date).plusWeeks(weeks).toDate();
    }
    
    public static Date addDays(Date date, int days) {
        return new LocalDateTime(date).plusDays(days).toDate();
    }
    
    public static Date addHours(Date date, int hours) {
        return new LocalDateTime(date).plusHours(hours).toDate();
    }
    
    public static Date addMinutes(Date date, int minutes) {
        return new LocalDateTime(date).plusMinutes(minutes).toDate();
    }
    
    public static Date addSeconds(Date date, int seconds) {
        return new LocalDateTime(date).plusSeconds(seconds).toDate();
    }
    
    public static Date truncate(Date date) {
        return new LocalDate(date).toDate();
    }
    
    public static long yearsBetween(Date startDate, Date endDate) {
        return Years.yearsBetween(new LocalDateTime(startDate), new LocalDateTime(endDate)).getYears();
    }
    
    public static long monthsBetween(Date startDate, Date endDate) {
        return Months.monthsBetween(new LocalDateTime(startDate), new LocalDateTime(endDate)).getMonths();
    }
    
    public static long weeksBetween(Date startDate, Date endDate) {
        return Weeks.weeksBetween(new LocalDateTime(startDate), new LocalDateTime(endDate)).getWeeks();
    }
    
    public static long daysBetween(Date startDate, Date endDate) {
        return Days.daysBetween(new LocalDateTime(startDate), new LocalDateTime(endDate)).getDays();
    }
    
    public static long hoursBetween(Date startDate, Date endDate) {
        return Hours.hoursBetween(new LocalDateTime(startDate), new LocalDateTime(endDate)).getHours();
    }
    
    public static long minutesBetween(Date startDate, Date endDate) {
        return Minutes.minutesBetween(new LocalDateTime(startDate), new LocalDateTime(endDate)).getMinutes();
    }
    
    public static long secondsBetween(Date startDate, Date endDate) {
        return Seconds.secondsBetween(new LocalDateTime(startDate), new LocalDateTime(endDate)).getSeconds();
    }
    
    public static boolean isLeapYear(Date date) {
        return Year.isLeap(getYear(date));
    }
    
}
