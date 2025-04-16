package com.mvk.sample;

import com.mvk.collections.HashMapSetExample;
import com.mvk.collections.HashmapExample;
import com.mvk.oops.Bike;
import com.mvk.oops.Car;

public class Sample {
    public static void main(String[] args) {
        System.out.println("Hello Vijayendra");
        Car car = new Car("Mahindra", 2025, 4);
        Bike bike = new Bike("Pulsar", 2019, false);
        car.displayInfo();
        bike.displayInfo();

        HashmapExample hashMapEx = new HashmapExample();
        hashMapEx.hashMap();

        HashMapSetExample hashMapSetEx = new HashMapSetExample();
        hashMapSetEx.hashMapSetEx();
    }
}
