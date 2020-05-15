package com.udemycourse;

public class Furniture {

    private int noofcupboards;
    private Almirah almirah;
    private Bed bed;


    public Furniture(int noofcupboards, Almirah almirah, Bed bed) {
        this.noofcupboards = noofcupboards;
        this.almirah = almirah;
        this.bed = bed;

    }

    public int getNoofcupboards() {
        return noofcupboards;
    }

    x Almirah getAlmirah() {
        return almirah;
    }

    public Bed getBed() {
        return bed;
    }


}
