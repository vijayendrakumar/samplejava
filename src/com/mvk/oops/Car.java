package com.mvk.oops;

public class Car extends Vehicle {
private int noOfDoors;
    public Car(String brand, int year, int noOfDoors) {
        super(brand, year);
        this.noOfDoors = noOfDoors;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println(STR."Doors: \{noOfDoors}");
    }
}
