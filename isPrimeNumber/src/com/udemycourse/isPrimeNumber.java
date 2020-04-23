package com.udemycourse;

public class isPrimeNumber {
    public static boolean isprimenumber(int number) {
        if (number == 1 || number == 0){
            System.out.println(number + " is not prime numbers");
            return false;
        }
        int checkprimenumber = 3;
        for (int i = 2; i < number; i++) {
            checkprimenumber = number % i;
            if (checkprimenumber == 0) {
                System.out.println(number + "number is not a prime number");
                return false;
            }

        }
        System.out.println(number + " is a prime number");
        return true;
    }
}








