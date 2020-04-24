package com.udemycourse;

public class Main {

    public static void main  (String[] args) {
	int number = 0;
	int counter = 0;
	for (int i = 1; i < 1000; i++){
       System.out.println("loop is running for " + i + " times");
	    if (i%15 == 0) {
            number = i + number;
            counter++;
            System.out.println(i + "is divisible by 3 & 5");
        }
	    if (counter == 5){
                break;
            }

        }

        
        System.out.println(" the sum of numbers that are divisible by 3 & 5 between 1 & 1000 is " + number);



    }
}
