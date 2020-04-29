package com.udemycourse;

public class NumberToWords {
    public static final String ZERO = "Zero";
    public static final String ONE = "One";
    public static final String TWO = "Two";
    public static final String THREE = "Three";
    public static final String FOUR = "Four";
    public static final String FIVE = "Five";
    public static final String SIX = "Six";
    public static final String SEVEN = "Seven";
    public static final String EIGHT = "Eight";
    public static final String NINE = "Nine";

    public static void numberToWords(int number) {

        if (number < 0) {
            System.out.println("Invalid Value");
        } else {
            int numcount = getDigitCount(number);
            number = reverse(number);
            int reversecount = getDigitCount(number);
            int remaining = numcount - reversecount;

            do {
                int remainder = number % 10;
                number = number / 10;
                switch (remainder) {
                    case 0:
                        System.out.println(ZERO);
                        continue;
                    case 1:
                        System.out.println(ONE);
                        continue;
                    case 2:
                        System.out.println(TWO);
                        continue;
                    case 3:
                        System.out.println(THREE);
                        continue;
                    case 4:
                        System.out.println(FOUR);
                        continue;
                    case 5:
                        System.out.println(FIVE);
                        continue;
                    case 6:
                        System.out.println(SIX);
                        continue;
                    case 7:
                        System.out.println(SEVEN);
                        continue;
                    case 8:
                        System.out.println(EIGHT);
                        continue;
                    case 9:
                        System.out.println(NINE);
                        continue;

                }
            } while (number != 0);

            for (int i = remaining; i > 0; i--) {
                System.out.println(ZERO);
            }

        }
    }


    public static int reverse(int number){
        int reversenumber = 0;

        while (number != 0){
            int remainder = number%10;
            reversenumber = reversenumber*10 + remainder;
            number = number/10;

        } return reversenumber;
    }
    public static int getDigitCount(int number){
        if (number < 0){
            return -1;
        }
        int count =0;
        do {number = number/10;
            count++;

        }
        while (number != 0);


        return count;
    }
}
