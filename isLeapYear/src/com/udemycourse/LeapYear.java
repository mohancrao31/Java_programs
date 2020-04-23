package com.udemycourse;

import javax.swing.*;
//both solutions are correct. the first 1 i.e in comments has been simplified below.
public class LeapYear {
    public static boolean isLeapYear(int year) {
//        int leapyearcheck;
//        leapyearcheck = year % 4;
//        if (leapyearcheck == 0 && year >= 1 && year <= 9999){
//            int hundredcheck = year%100;
//             if (hundredcheck == 0) {
//                 int fourhundredcheck = year%400;
//                 return fourhundredcheck == 0;
//             }else {
//                 return true;
//             }
//
//        } else {
//            return false;
//        }

        if ((year >= 1 && year <= 9999) && (((year%4 == 0) && (year%100 != 0)) || (year % 400 == 0))) {
            return true;
        } else return false;



    }
}