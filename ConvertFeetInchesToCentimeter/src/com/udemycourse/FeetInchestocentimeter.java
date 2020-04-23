package com.udemycourse;

public class FeetInchestocentimeter {
    public static double calcFeetAndInchesToCentimeters(double feet, double inches) {
        if (feet >= 0 && inches >= 0 && inches <= 12) {
            double inchtoCentimeter;
            double feettoinch = 12 * feet;
            double totalinch = feettoinch + inches;
            inchtoCentimeter = 2.54 * totalinch;
            System.out.println(inchtoCentimeter + " cms ");
            return inchtoCentimeter;

        } else {
            int errorcode = -1;
            System.out.println(errorcode);
            return errorcode;

        }

    }

    public static double calcFeetAndInchesToCentimeters(double inches) {
        if (inches >= 0) {
            double inchestofeet;
            inchestofeet = (int)(inches / 12);
            double remainng_inches = (int)(inches%12);
            System.out.println(inches + " inches = " + inchestofeet + " ft " + remainng_inches + " inches ");
            System.out.print(inches + " inches are equal to ");
            return calcFeetAndInchesToCentimeters(inchestofeet, remainng_inches);

        } else {

            int errorcode = -1;
            System.out.println(errorcode);
            return errorcode;
        }
    }
}