package com.udemycourse;

public class Main {

    public static void main(String[] args) {
	// write your code here

        int startnumber = 4;
        int finish = 20;
        int count = 0;
                while (startnumber <= finish) {
                    startnumber++;

                    if (!isEvenNumber (startnumber) ){
                        continue;

                    } System.out.println("the ven number is " + startnumber);
                    count++;

                    if (count >= 5) {
                        break;
                    }


                }
        System.out.println(" total even numbers found are " + count);

    }

    public static boolean isEvenNumber (int number){
        if (number%2 == 0){
            return true;
        }
        return false;

    }
}
