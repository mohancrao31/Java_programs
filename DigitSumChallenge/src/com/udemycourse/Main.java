package com.udemycourse;

public class Main {

    public static void main(String[] args) {
        // write your code here
            System.out.println(sumDigits(10));
    }

    public static int sumDigits(int number) {

        int sum = 0;
        if (number < 10) {
            return -1;
        } else {
            while (number >= 10) {
                int unitdigit = number % 10;
                sum += unitdigit;
                number = number / 10;

            }
            sum = sum + number;
            return sum;
        }
    }
}
