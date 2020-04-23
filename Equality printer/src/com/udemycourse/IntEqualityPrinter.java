package com.udemycourse;

public class IntEqualityPrinter {
    public static final String INVALID_ERROR_MESSAGE = "Invalid Value";

    public static void printEqual (int num1, int num2, int num3){
        if (num1 < 0 || num2 < 0 || num3 < 0 ){
            System.out.println(INVALID_ERROR_MESSAGE);
        }
        else if (num1 == num2 && num2 == num3){
            System.out.println("All numbers are equal");
        }
        else if (num1 != num2 && num2 != num3 && num1 != num3){
            System.out.println("All numbers are different");
        } else
            System.out.println("Neither all are equal or different");
    }
}
