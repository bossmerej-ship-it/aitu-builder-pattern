package com.carrental;

public class Main {
    public static void main(String[] args) {
        CarDirector director = new CarDirector();

        CarBuilder sedanBuilder = new SedanCarBuilder();
        director.constructToyotaCamry(sedanBuilder);
        Car camry = sedanBuilder.build();
        camry.displayInfo();

        CarBuilder sportsBuilder = new SportsCarBuilder();
        director.constructPorsche911(sportsBuilder);
        Car porsche = sportsBuilder.build();
        porsche.displayInfo();

        Car customCar = new SedanCarBuilder()
                .setBrand("Hyundai")
                .setModel("Elantra")
                .setYear(2022)
                .build();
        customCar.displayInfo();
    }
}