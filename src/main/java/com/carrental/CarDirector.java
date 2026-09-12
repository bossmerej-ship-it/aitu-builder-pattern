package com.carrental;

public class CarDirector {
    public void constructToyotaCamry(CarBuilder builder) {
        builder.setBrand("Toyota")
                .setModel("Camry")
                .setColor("Black")
                .setYear(2023)
                .setTransmission("Automatic");
    }

    public void constructPorsche911(CarBuilder builder) {
        builder.setBrand("Porsche")
                .setModel("911 GT3")
                .setColor("Yellow")
                .setYear(2024)
                .setTransmission("Manual");
    }
}