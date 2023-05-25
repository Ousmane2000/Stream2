package com.yearup.streams;

public class car {
    private String make;
    private int vin;

    public car(String make, int vin) {
        this.make = make;
        this.vin = vin;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public int getVin() {
        return vin;
    }

    public void setVin(int vin) {
        this.vin = vin;
    }
}
