package com.udemycourse;

import java.util.Scanner;

class Car{
    private int cylinders;
    private String name;
    private int wheels;
    private int doors;
    protected int speed = 240;
    private boolean Engine;

    public Car(){
        this.cylinders = 5;
        this.speed = 300;
        this.doors = 4;
    }

    public Car(String name, int cylinders,  int doors){
        this.cylinders = cylinders;
        this.name = name;

        this.wheels = 4;
        this.doors = doors;
        this.Engine = true;

    }

    public int getSpeed() {
        if(speed < 0){
            return -1;
        } else
        return speed;
    }

    public int getCylinders() {
        return cylinders;
    }

    public int getDoors() {
        return doors;
    }

    public int getWheels() {
        return wheels;
    }

    public String getName() {
        return name;
    }

    public boolean isEngine() {
        return Engine;
    }

    public void startengine(){
        if(ignition(isEngine())){
            System.out.println(" the engine is starting ");
        } else
            System.out.println(" no ignition");
    }

    public boolean ignition(boolean ignit){
        return ignit;
    }

    public void accelerate(int rate){

        System.out.println(" time taken to reach max speed is  " + getSpeed());
    }
}

class hyundai extends Car{

    public hyundai(int speed){
        super("i10", 6,5 );
        this.speed = speed;

    }


}

class maruti extends Car{
    public maruti(int speed){
        super("baleno", 5, 5);
    }
    public void accelerate(int rate){
        System.out.println("the car's acceleration is poor "  + getSpeed()/rate*2);
    }
}


public class Main {

    public static void main(String[] args) {
	// write your code here;

        for(int i =0; i< 17; i++){
            Car car = type();
            System.out.println(" the car with random value of " + car.getName());
            car.accelerate(40);
        }
        }

        public static Car type(){
        int random = (int)(Math.random()*3);
            System.out.println(random);
        switch(random){
            case 1:

                return new hyundai(340);

            case 2:
                return new maruti(32);

            default:
                return new hyundai(400);
        }
    }
}
