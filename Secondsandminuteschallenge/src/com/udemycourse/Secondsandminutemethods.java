package com.udemycourse;

import com.sun.jdi.Value;

public class Secondsandminutemethods {
    private static final String INVALID_MESSAGE_TYPE = "INVALID VALUE";

    public static String getDurationString(long minutes, long seconds) {

        if (minutes < 0 || seconds < 0 || seconds > 59) {
            return INVALID_MESSAGE_TYPE;
        } else {
            long hours;

            hours = minutes / 60;
            long remainingminutes = minutes % 60;
            String value = hours + " h " + remainingminutes + " m " + seconds + " s ";
            System.out.println(minutes + " minutes " + seconds + " seconds is equal to " + value);
            return value;
        }
    }

    public static String getDurationString(long seconds) {
        if (seconds < 0) {
            return INVALID_MESSAGE_TYPE;
        } else {
            long secondestominutes = seconds / 60;
            long remaining_seconds = seconds % 60;
            System.out.println(seconds + " s is equal to " + secondestominutes + " mins " + remaining_seconds + " seconds");
            String value = getDurationString(secondestominutes, remaining_seconds);
            return value;
        }

    }
}

