package com.udemycourse;

public class EvenDigitSum {
    public static final int ERROR_MESSAGE = -1;
    public static int getEvenDigitSum (int number){
        if (number < 0){
            return ERROR_MESSAGE;
        } else { int sum = 0;
            while (number > 0) {
                int remainder = number%10;
                if (remainder%2 != 0){
                    number = number/10;
                    continue;
                }
                sum = remainder + sum;
                number = number/10;
            } return sum;
        }
    }
}
