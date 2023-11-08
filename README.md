## Date Utils ##

A collection of useful date utilities.

Date string to Date

```java
Date date = DateUtils.toDate("2021-12-01", "yyyy-MM-dd");
```

Date to string

```java
String dateString = DateUtils.toString(date, "yyyy-MM-dd");
```

Get year from Date

```java
int year = DateUtils.getYear(date);
```

Get month from Date

```java
int month = DateUtils.getMonth(date);
```

Get day from Date

```java
int day = DateUtils.getDay(date);
```

Get hour from Date

```java
int hour = DateUtils.getHour(date);
```

Get minute from Date

```java
int minute = DateUtils.getMinute(date);
```

Get second from Date

```java
int second = DateUtils.getSecond(date);
```

Find if Date is AM

```java
boolean am = DateUtils.isAM(date);
```

Find if Date is PM

```java
boolean pm = DateUtils.isPM(date);
```

Get day of the week string from Date (e.g. "Wednesday")

```java
String day = DateUtils.getDayOfWeekString(date);
```

Add year(s) to Date

```java
Date newDate = DateUtils.addYears(date, 2);
```


Add month(s) to Date

```java
Date newDate = DateUtils.addMonths(date, 2);
```

Add week(s) to Date

```java
Date newDate = DateUtils.addWeeks(date, 2);
```

Add day(s) to Date

```java
Date newDate = DateUtils.addDays(date, 2);
```

Add hour(s) to Date

```java
Date newDate = DateUtils.addHours(date, 2);
```

Add minute(s) to Date

```java
Date newDate = DateUtils.addMinutes(date, 2);
```

Add second(s) to Date

```java
Date newDate = DateUtils.addSeconds(date, 45);
```

Truncate Date

```java
Date newDate = DateUtils.truncate(date);
```

Get number of years between two Dates

```java
long years = DateUtils.yearsBetween(startDate, endDate);
```

Get number of months between two Dates

```java
long months = DateUtils.monthsBetween(startDate, endDate);
```

Get number of weeks between two Dates

```java
long weeks = DateUtils.weeksBetween(startDate, endDate);
```

Get number of days between two Dates

```java
long days = DateUtils.daysBetween(startDate, endDate);
```

Get number of hours between two Dates

```java
long hours = DateUtils.hoursBetween(startDate, endDate);
```

Get number of minutes between two Dates

```java
long minutes = DateUtils.minutesBetween(startDate, endDate);
```

Get number of seconds between two Dates

```java
long seconds = DateUtils.secondsBetween(startDate, endDate);
```

Find if Date is a Leap Year

```java
boolean leapYear = DateUtils.isLeapYear(date);
```
