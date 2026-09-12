package com.carrental;

public class Car {
    private final String brand;
    private final String model;
    private final String color;
    private final int year;
    private final String transmission;

    public Car(String brand, String model, String color, int year, String transmission) {
        this.brand = brand;
        this.model = model;
        this.color = color;
        this.year = year;
        this.transmission = transmission;
    }

    public void displayInfo() {
        System.out.println("Car: " + brand + " " + model +
                " | Year: " + year +
                " | Color: " + color +
                " | Transmission: " + transmission);
    }
}