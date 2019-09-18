package com.example.practicejavaintemediatelibrary;

public class CarSimulator {
    public static void main(String[] args) {
        System.out.println("Hey! Welcome to Java Programming World.");
        Car myFirstCar = new Car();
        System.out.println("My first car's color is " + myFirstCar.color);
        Car mySecondCar = new Car("Blue");
        System.out.println("My second car's color is " + mySecondCar.color);
    }
}
