package com.udemycourse;

import java.sql.SQLOutput;

public class Main {

    public static void main(String[] args) {
	// write your code here

//        SimpleCalculator numberset = new SimpleCalculator();
//        numberset.setFirstNumber(100);
//        numberset.setSecondNumber(200);
//        SimpleCalculator Calculator = new SimpleCalculator();
//        Calculator.setSecondNumber(-1);
//        Calculator.setFirstNumber(100);
//        System.out.println("Add " + numberset.getAdditionResult());
//        System.out.println("Subtraction " + Calculator.getSubtractionResult());

        Person P1 = new Person();
        Person P2 = new Person();
        Person P3 = new Person();

        P1.setFirstName("Mohan");
        P1.setLastName("Rao");
        P1.setAge(29);

        P2.setFirstName("Shalu");
        P2.setLastName("");
        P2.setAge(33);

        P3.setFirstName("");
        P3.setLastName("Kohli");
        P3.setAge(15);

        System.out.println(P1.getFullName() + " is of age " + P1.getAge() + " isTeen" + P1.isTeen());
        System.out.println(P2.getFullName() + " is of age " + P2.getAge() + " isTeen" + P2.isTeen());
        System.out.println(P3.getFullName() + " is of age " + P3.getAge() + " isTeen" + P3.isTeen());
    }
}
