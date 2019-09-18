package com.example.practicejavaintemediatelibrary;

public class CarSimulator {
    public static void main(String[] args) {

        Car mHondaCar = new Car("Black", "Wood");
        mHondaCar.drive();

        SelfDrivingCar autobot = new SelfDrivingCar("Black", "Plastic");
        autobot.drive();
    }
}
