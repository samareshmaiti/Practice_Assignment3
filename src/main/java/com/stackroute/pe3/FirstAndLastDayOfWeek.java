package com.stackroute.pe3;
import java.util.*;
import java.text.*;
import java.util.zip.DataFormatException;

public class FirstAndLastDayOfWeek
{

    public static String getDate(String calender) throws Exception, DataFormatException {
        String resultString="";

        // return "Enter non empty input";
        // Get calendar set to current date and time

        Calendar c = Calendar.getInstance();

        // Set the calendar to monday of the current week
        c.set(Calendar.DAY_OF_WEEK, Calendar.MONDAY);

        // Print dates of the current week starting on Monday
        DateFormat df = new SimpleDateFormat("EEE dd/MM/yyyy");
        //get the first day of the week
        String firstDay = df.format(c.getTime());
        for (int i = 0; i < 6; i++) {
            c.add(Calendar.DATE, 1);
        }
        //get the last day of the week
        String lastDay = df.format(c.getTime());
        resultString = lastDay + " " + firstDay;

        //return first day and last day of the week
        return resultString;

    }
}
