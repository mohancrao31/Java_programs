package com.udemycourse;

public class LeapYear {
    public static boolean isLeapYear(int year) {
        int leapyearcheck;
        leapyearcheck = year % 4;
        if (leapyearcheck == 0 && year >= 1 && year <= 9999){
            int hundredcheck = year%100;
             if (hundredcheck == 0) {
                 int fourhundredcheck = year%400;
                 return fourhundredcheck == 0;
             }else {
                 return true;
             }

        } else {
            return false;
        }


    }
}