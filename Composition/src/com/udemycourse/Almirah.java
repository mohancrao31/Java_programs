package com.udemycourse;

import java.awt.*;

public class Almirah {
    private Dimension dimension;

    public Almirah(Dimension dimension) {
        this.dimension = dimension;
    }

    public void getArea(Dimension dimension1){
        Dimension dimension = new Dimension(dimension1);
        double area = dimension1.height*dimension1.width;
    }
}
