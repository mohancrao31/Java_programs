package com.udemycourse;
// for single digit numbers as first and last digits are same, they should be added twice.
    public class FirstLastDigitSum {
        public static int sumFirstAndLastDigit(int number){
            if (number < 0){
                return -1;

            } else {
                int lastdigit = number%10;

                int firstdigit = 0;
                while ( number > 0){
                    firstdigit = number%10;
                    number = number/10;
                } int sum = firstdigit + lastdigit;
                return sum;
            }
        }
    }
