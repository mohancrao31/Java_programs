package com.udemycourse;

import java.sql.SQLOutput;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int myValue = 10000;
        int myMinvalue = Integer.MIN_VALUE;
        int myMaxvalue = Integer.MAX_VALUE;
        System.out.println("the mimimum value = " + myMinvalue);
        System.out.println("the maximum value = " + myMaxvalue);
        System.out.println("TheBusted Maximum Value = " + (myMaxvalue+1));
        System.out.println("Busted Min Value = " + (myMinvalue-1));
        int myMaxinttest = 2_147_483_647;
        System.out.println(myMaxinttest);
        byte myMaxbytevalue = Byte.MAX_VALUE;
        byte myMinbytevalue = Byte.MIN_VALUE;
        System.out.println("byte Minimum value = " + myMinbytevalue);
        System.out.println("byte maximum value = " + myMaxbytevalue);

        short myMaxShortvalue = Short.MAX_VALUE;
        short myMinShortvalue = Short.MIN_VALUE;
        System.out.println("Short Minimum value = " + myMinShortvalue);
        System.out.println("Short maximum value = " + myMaxShortvalue);
        long myLongvalue = 100L;
        long myMaxLongvalue = Long.MAX_VALUE;
        long myMinLongvalue = Long.MIN_VALUE;
        System.out.println("Long Minimum value = " + myMinLongvalue);
        System.out.println("Long maximum value = " + myMaxLongvalue);
        long literal_value = myMaxinttest+0L;
        System.out.println(literal_value);
        System.out.println(myLongvalue);
        int mytotalvalue = myMinvalue/2;
        byte mybytevalu = (byte)(myMinbytevalue/2);



    }
}
