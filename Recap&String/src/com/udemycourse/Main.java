package com.udemycourse;

public class Main {

    public static void main(String[] args) {
	//recap of all primitive types
        //byte
        //short
        //int
        //float
        //double
        //char
        //long
        //boolean

        String myString = "This is a string";
        System.out.println("My string = " + myString);
        myString = myString + ",and this is more.";
        System.out.println("My string is equal to " + myString);
        myString = "the copyright symbol is " + "\u00a9 2019";
        System.out.println(myString);
        String laststring = "50";
        int myinteger = 10;
        laststring = laststring + myinteger;
        System.out.println("the last string is "+laststring);

          }
}
