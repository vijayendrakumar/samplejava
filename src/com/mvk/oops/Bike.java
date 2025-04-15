package com.mvk.oops;

public class Bike extends Vehicle {

    private boolean isElectric;
    public Bike(String brand, int year, boolean isElectric) {
        super(brand, year);
        this.isElectric = isElectric;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println(STR."isElectric: \{isElectric ? "Yes" : "No"}");
    }
}
