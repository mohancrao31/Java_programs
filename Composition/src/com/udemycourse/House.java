package com.udemycourse;

public class House {

    private String room;
    private Dimensions dimension;
    private Furniture furn;


    public House(String room, Dimensions dimension, Furniture furn) {
        this.room = room;
        this.dimension = dimension;

        this.furn = furn;
    }

    public String getRoom() {
        return room;
    }

    public Dimensions getDimension() {
        return dimension;
    }

    public void getArea(){
        System.out.println();
    }

    public Furniture getFurn() {
        return furn;
    }
}
