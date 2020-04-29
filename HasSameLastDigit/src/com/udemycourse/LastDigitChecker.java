package com.udemycourse;

public class LastDigitChecker {
    public static boolean hasSameLastDigit(int num1, int num2, int num3){
                   boolean checker;
            if(isValid(num1) && isValid(num2) && isValid(num3)){
                int lastdigitsnum1 = num1%10;
                int lastdigitsnum2 = num2%10;
                int lastdigitsnum3 = num3%10;

                return ((lastdigitsnum1 == lastdigitsnum2 || lastdigitsnum1 == lastdigitsnum3 || lastdigitsnum2 == lastdigitsnum3));

            }
                return false;

    }

    public static boolean isValid (int num1){
        return (num1 >= 10 && num1 <= 1000);
    }
}
