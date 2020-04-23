package com.udemycourse;

import org.w3c.dom.ls.LSOutput;

import java.sql.SQLOutput;

public class Main {

    public static void main(String[] args) {
        int highscoreposition = calculatehighscoreposition(1500);
        displayhighscoreposition("Mohan",highscoreposition);

        highscoreposition = calculatehighscoreposition(750);
        displayhighscoreposition("Sachin", highscoreposition);

        highscoreposition = calculatehighscoreposition(50);
        displayhighscoreposition("Rahul", highscoreposition);



    }
    public static void displayhighscoreposition(String playername, int position){
        System.out.println(playername + " managed to get into position " + position + " on the high score table");

    }
    public static int calculatehighscoreposition (int score){
        int position = 4;
        if (score >= 1000){
            position = 1;
        }
        else if (score >= 500){
            position = 2;
        }
        else if (score >= 100) {
            position = 3;
        }
        return position;

    }

}
