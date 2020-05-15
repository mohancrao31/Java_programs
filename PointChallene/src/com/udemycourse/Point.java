package com.udemycourse;

public class Point {

    private int x;
    private int y;

        public Point(){

        }
        public Point(int x, int y){
            this.x = x;
            this.y = y;

        }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public double distance (){
          return Math.sqrt((getX()*getX()) + (getY()*getY()));
    }

    public double distance (int x, int y){

        return   Math.sqrt(((getX()-x)*(getX()-x))+((getY()-y)*(getY()-y)));
    }

    public double distance (Point Another){
            return Math.sqrt(((getX()-Another.getX())*(getX()-Another.getX()))+((getY()-Another.getY())*(getY()-Another.getY())));

    }
}
