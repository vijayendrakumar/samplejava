package com.mvk.oops;

public class Vehicle {
    private String brand;
    private int manufactureYear;

    public Vehicle(String brand, int year) {
        this.brand = brand;
        this.manufactureYear = year;
    }

    public void displayInfo() {
        System.out.printf("Brand:%s, Year%d%n", brand, manufactureYear);
    }

    public String getBrand() { return brand; }
    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getManufactureYear() { return  manufactureYear; }

    public void setManufactureYear(int manufactureYear) {
        this.manufactureYear = manufactureYear;
    }
}
