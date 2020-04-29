package com.udemycourse;

public class SharedDigit {
    public static boolean hasSharedDigit(int num1, int num2){
            if (num1 < 10 || num1 > 99 || num2 < 10 || num2 > 99){
                return false;
            }else {
                while (num1 != 0){
                    int remainder1 = num1%10;
                    int quotient2 = num2;
                    while (quotient2 != 0){
                        int remainder2 = quotient2%10;
                        if (remainder2 == remainder1){
                            return true;
                        } quotient2 = quotient2/10;

                    }  num1 = num1/10;
                } return false;
            }
    }
}
