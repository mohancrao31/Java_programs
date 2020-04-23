package com.udemycourse;

public class MinutesToYearsDaysCalculator {                   //converting days to years, days format. 1 Year = 365 Days
    public static final String INVALID_MESSAGE_ERROR = "Invalid Value";     //Constant Error Message//

    public static void printYearsAndDays (long minutes){
        if (minutes < 0 ){
            System.out.println(INVALID_MESSAGE_ERROR);
        }
        else {
            long totaldays = minutes/(60*24);           //Converting Minutes To Days
            long total_years = totaldays/365;
            long remaining_days = totaldays % 365;

            System.out.println( minutes + " min = " + total_years + " y and " + remaining_days + " d ");
        }
    }
}
