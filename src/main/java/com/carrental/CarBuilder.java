package com.carrental;

public interface CarBuilder {
    CarBuilder setBrand(String brand);
    CarBuilder setModel(String model);
    CarBuilder setColor(String color);
    CarBuilder setYear(int year);
    CarBuilder setTransmission(String transmission);
    Car build();
}