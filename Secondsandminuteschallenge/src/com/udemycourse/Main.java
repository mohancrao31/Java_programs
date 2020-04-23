package com.udemycourse;

public class Main {
    public static final String INVALID_MESSAGE_TYPE = "Invalid Value";
    public static void main(String[] args) {
	// write your code here

        Secondsandminutemethods.getDurationString(100000);
        System.out.println(Secondsandminutemethods.getDurationString(65, -45));
    }
}
