package com.udemycourse;

public class Vehicle {
    private String Type;
    private int speed;
    private int gear;
    private boolean isManual;

    public Vehicle(String type, int speed, boolean isManual){
        this.Type = type;
        this.speed = speed;
        this.gear = 0;
        this.isManual = isManual;
    }


    public int getSpeed() {
        return speed;
    }

    public int getGear() {
        return gear;
    }

    public String getType() {
        return Type;
    }

    public void setGear(int gear) {
        this.gear = gear;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public boolean isManual() {
        return isManual;
    }
}
