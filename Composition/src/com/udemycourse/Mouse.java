package com.udemycourse;

public class Mouse {

    public boolean isIsbluetooth() {
        return isbluetooth;
    }

    public String getBrand() {
        return brand;
    }

    private boolean isbluetooth;
    private String brand;

    public Mouse(boolean isbluetooth, String brand) {
        this.isbluetooth = isbluetooth;
        this.brand = brand;
    }


}
