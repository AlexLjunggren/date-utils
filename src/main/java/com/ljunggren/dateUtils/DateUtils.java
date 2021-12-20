package com.ljunggren.dateUtils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.joda.time.LocalDate;
import org.joda.time.LocalDateTime;

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
        return new LocalDate(date).getYear();
    }
    
    public static int getMonth(Date date) {
        return new LocalDate(date).getMonthOfYear();
    }
    
    public static int getDay(Date date) {
        return new LocalDate(date).getDayOfMonth();
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
    
    public static Date addYears(Date date, int years) {
        return new LocalDate(date).plusYears(years).toDate();
    }

    public static Date addMonths(Date date, int months) {
        return new LocalDate(date).plusMonths(months).toDate();
    }
    
    public static Date addWeeks(Date date, int weeks) {
        return new LocalDate(date).plusWeeks(weeks).toDate();
    }
    
    public static Date addDays(Date date, int days) {
        return new LocalDate(date).plusDays(days).toDate();
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
    
}
