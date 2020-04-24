package com.udemycourse;

public class SumOddRange {
    public static final int INVALID_ERROR_MESSAGE = -1;
    public static boolean isOdd(int number){
        if (number < 0) {
            return false;
        }
       return ((number%2 != 0));
    }

    public static int sumOdd(int start, int end){
        if (start > 0 && end > 0 && end >= start){
            int number = 0;
            for (int i = start; i <= end; i++){
                if ((isOdd(i))){
                    number = number + i;
                }
            }
            return number;
        } else

        return INVALID_ERROR_MESSAGE;
    }
}
