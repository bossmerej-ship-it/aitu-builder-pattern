package com.carrental;

public class SedanCarBuilder implements CarBuilder {
    private String brand;
    private String model;
    private String color = "White";
    private int year;
    private String transmission = "Automatic";

    @Override
    public CarBuilder setBrand(String brand) {
        this.brand = brand;
        return this;
    }

    @Override
    public CarBuilder setModel(String model) {
        this.model = model;
        return this;
    }

    @Override
    public CarBuilder setColor(String color) {
        this.color = color;
        return this;
    }

    @Override
    public CarBuilder setYear(int year) {
        this.year = year;
        return this;
    }

    @Override
    public CarBuilder setTransmission(String transmission) {
        this.transmission = transmission;
        return this;
    }

    @Override
    public Car build() {
        if (brand == null || brand.isBlank()) {
            throw new IllegalStateException("Brand is required");
        }
        if (year < 1900) {
            throw new IllegalStateException("Invalid manufacturing year");
        }
        return new Car(brand, model, color, year, transmission);
    }
}