package com.udemycourse;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Scanner value = new Scanner(System.in);

        int minnum = Integer.MAX_VALUE;
        int maxnum = Integer.MIN_VALUE;
        while (true){
            System.out.println(" Enter Number");
            boolean Isint = value.hasNextInt();
            if (Isint){
                int number = value.nextInt();
                minnum = Math.min(minnum, number);
                maxnum = Math.max(maxnum, number);

            } else {
                System.out.println(" The Minimum Number entered is " + minnum + " & the max number entered is " + maxnum);
                break;
            }value.nextLine();

        } value.close();
    }
}
