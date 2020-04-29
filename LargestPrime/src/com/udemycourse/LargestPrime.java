package com.udemycourse;

public class LargestPrime {
    public static int getLargestPrime(int number){
        int value = -1;
        if (number >= 0){
            for (int i = number; i > 0; i--){
                if (number%i == 0){
                    if (LargestPrime.isPrime(i)){
                        return i;
                    }
                }
            }



        } return value;
    }
    public static boolean isPrime(int number){

        if (number == 1){
            return true;
        }
        for (int i = 2; i <= number/2; i++){
            if(number%i == 0){
                return false;
            }
        } return true;
    }
}