package com.udemycourse;

public class DayoftheWeek {
    public static void printDayOfTheWeek_switch(int day){
        switch (day) {
            case 0:
                System.out.println("Sunday");
                break;

            case 1:
                System.out.println("Monday");
                break;

            case 2:
                System.out.println("Tuesday");
                break;

            case 3:
                System.out.println("Wednesday");
                break;

            case 4:
                System.out.println("Thursday");
                break;

            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;

            default:
                System.out.println("Invalid Day");
                break;

        }
    }
    public static void printDayoftheWeek_ifelse (int day){
        if (day >=7 || day < 0){
            System.out.println("Invalid Value");
        }
        else printDayOfTheWeek_switch(day);
    }
}
