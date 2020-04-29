package com.udemycourse;

public class DiagonalStar {
    public static void printSquareStar(int number) {
        if (number < 5) {
            System.out.println("Invalid Value");
        } else {

            for (int rownumber = 1; rownumber <= number; rownumber++) {
                for (int columnnumber = 1; columnnumber <= number; columnnumber++) {
                    if (rownumber == 1 || rownumber == number || columnnumber == 1 || columnnumber == number) {
                        System.out.print("*");
                    } else if (rownumber == columnnumber) {
                        System.out.print("*");
                    } else if (columnnumber == number - rownumber + 1) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                }
                System.out.println("");
            }
        }
    }
}