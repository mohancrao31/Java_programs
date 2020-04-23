package com.udemycourse;


public class OperatorOperand {
    public static void main(String[] args) {
      double doublevariable = 20.00d;
      double seconddoublevar = 80.00d;
      double operations = (doublevariable+seconddoublevar)*100;
        System.out.println("the value of operations is " + operations );
      double remainder = operations%40.00;
        System.out.println("the remainder is " + remainder);
        boolean variables = (remainder == 0)? true:false;
        System.out.println("the boolean value is " + variables);
        if(variables) {
            System.out.println(" Got some message");
            int[] age = {10,20,30};
            System.out.println(age[1]);

        }


    }


}
