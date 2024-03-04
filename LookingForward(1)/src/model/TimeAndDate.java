/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.time.format.DateTimeFormatter;
import java.time.LocalDateTime;
/**
 *
 * @author aly35
 */
public class TimeAndDate {
DateTimeFormatter date_and_time = DateTimeFormatter.ofPattern("MM/dd/yyyy HH:mm:ss");
LocalDateTime currentTime = LocalDateTime.now();
LocalDateTime endTime;

private int year;
private int month;
private int day;
private int hour;
private int minute;
private int second;

public TimeAndDate()
    {
    
    }


public void SetDate(int y, int m, int d, int h, int min, int sec)
    {
String temp = String.valueOf(y);
    if (temp.equals("4") && y >0 && y < 10000)
       year = y;
    else 
    System.out.println("Value for year must be four digits");
 
temp = String.valueOf(m);
    if (temp.equals("2") && m < 12 && m > 0)
        month = m;
    else 
      System.out.println("Value for month must be two digits between 1 and 12");
    
temp = String.valueOf(d);   
    if (temp.equals("2") && d < 32 && d > 0)
        day = d;
    else 
       System.out.println("Value for month must be two digits between 1 and 31");
    
temp = String.valueOf(h);
    if (temp.equals("2") && h < 24 && h > 0)
        hour = h; 
    else 
        System.out.println("Value for hours must be two digits between 1 and 24");
temp = String.valueOf(min);
    if (temp.equals("2") && min < 60 && min > 0)
        minute = min; 
    else 
       System.out.println("Value for minutes must be two digits between 1 and 60");
temp = String.valueOf(sec);

    if (temp.equals("2") && sec < 60 && sec > 0)
        second = sec;
    else 
        System.out.println("Value for seconds must be two digits between 1 and 60");
    
    }
    
public String getCurrentTime()
    {
    return (date_and_time.format(currentTime));
    }


public String getEndTime()
    {
    endTime = LocalDateTime.of(year, month, day, hour, minute, second);
    return (date_and_time.format(endTime));
    }

public int GetYears()
    {
    return (year);
    }
public int GetMonths()
    {
    return (month);
    }

public int GetDays()
    {
    return (day);
    }

public int GetHours()
    {
    return (hour);
    }
public int GetMinutes()
    {
    return (minute);
    }
public int GetSeconds()
    {
    return (second);
    }

}
