package com.udemycourse;

public class CPU {

    private int ram;
    private String brand;
    private int hardiskspace;


    public CPU(int ram, String brand, int hardiskspace) {
        this.ram = ram;
        this.brand = brand;
        this.hardiskspace = hardiskspace;
    }



    public int getRam() {
        return ram;
    }

    public String getBrand() {
        return brand;
    }

    public int getHardiskspace() {
        return hardiskspace;
    }

    public double processingspeed(){
        return (double) hardiskspace/ram;
    }

    public CPU fasteroftwo(CPU c1, CPU c2){
        if(c1.processingspeed()>processingspeed()){
            return c1;
        } else
            return c2;
    }
}
