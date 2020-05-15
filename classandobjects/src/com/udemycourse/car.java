package com.udemycourse;

public class car {
    private int doors;
    private int wheels;
    private String engines;
    private String model;
    private String colour;
    public void setModel(String model){
        this.model = model;
    }

    public String getModel(){
        return this.model;
    }
    public void setDoors() {
        String validmodel = getModel();
        if (validmodel.equals("i10")) {
            this.doors = 4;
        } else
            this.doors = 5;
    }
    public int getDoors(){

        return this.doors;
    }
}