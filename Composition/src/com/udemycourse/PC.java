package com.udemycourse;



public class PC {

    private Monitor monitor;
    private Keyboard keyboard;
    private Mouse mouse;
    private CPU cpu;


    public PC(Monitor monitor, Keyboard keyboard, Mouse mouse, CPU cpu) {
        this.monitor = monitor;
        this.keyboard = keyboard;
        this.mouse = mouse;
        this.cpu = cpu;
    }

    public Monitor getMonitor() {
        return monitor;
    }

    public Keyboard getKeyboard() {
        return keyboard;
    }

    public Mouse getMouse() {
        return mouse;
    }

    public CPU getCpu() {
        return cpu;
    }

}
