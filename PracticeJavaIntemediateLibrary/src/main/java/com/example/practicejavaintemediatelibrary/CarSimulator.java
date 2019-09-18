package com.example.practicejavaintemediatelibrary;

public class CarSimulator {
    public static void main(String[] args) {
        System.out.println("Hey! Welcome to Java Programming World.");
        Car myFirstCar = new Car();
        System.out.println("My first car's color is " + myFirstCar.color + " and its interior is " + myFirstCar.getInterior());
        Car mySecondCar = new Car("Blue", "Wood");
        System.out.println("My second car's color is " + mySecondCar.color + " and its interior is " + mySecondCar.getInterior());
        Car myThirdCar = new Car("Blue", "Wood");
        myThirdCar.setInterior("Steel");
        System.out.println("My second car's color is " + myThirdCar.color + " and its interior is " + myThirdCar.getInterior());
    }
}
