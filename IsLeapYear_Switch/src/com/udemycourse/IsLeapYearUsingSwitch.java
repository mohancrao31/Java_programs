package com.udemycourse;
// the solution for leap year here is large, it is due to the fact, that I wanted to show how leap year can be checked via switch statement.
//with a single line if statement the solution to ifLeapYear can be and should be done.
public class IsLeapYearUsingSwitch {
    public static boolean isLeapYear (int year){
        if (year >=1 && year <= 9999){
            int yearby4 = year%4;
            switch (yearby4) {
                case 0:
                    int yearby100 = year%100;
                    switch (yearby100){
                        case 0:
                            int yearby400 = year%400;
                            switch (yearby400){
                                case 0:
                                    return true;
                                default:
                                    return false;
                            }
                        default:
                            return true;
                    }
                default:
                    return false;

            }

        } else
            return false;

    }
    public static int getDaysInMonth (int month, int year) {
        if (month <1 || month > 12 || year < 1 || year >9999){
            return -1;
        }
        else {
            int DaysInMonth;
            switch (month){
                case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                    return 31;

                case 2:
                    boolean leapyearcheck = (isLeapYear(year));
                    if (leapyearcheck) {
                        return 29;
                    } else
                        return 28;

                default:
                    return 30;


            }
        }

    }

}
