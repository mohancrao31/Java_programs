package com.udemycourse;

public class NumberPalindrome {

    // A simpler solution I found on web is
    public static boolean isPalindrome(int number) {


        int remainder = 0;

        int reverse = 0;

        int testNumber = number;

        while (number != 0) {


            remainder = number % 10;

            reverse = reverse * 10 + remainder;

            number = number / 10;


        }

        if (testNumber == reverse) {

            return true;


        } else {


            return false;


        }
    }
}