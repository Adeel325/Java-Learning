package com.example.practicejavaintemediatelibrary;

public class CarSimulator {
    public static void main(String[] args) {
        System.out.println("Hey! Welcome to Java Programming World.");
        Car myFirstCar = new Car();
        System.out.println("My first car's color is " + myFirstCar.color + " and its interior is " + myFirstCar.getInterior());
        Car mySecondCar = new Car("Blue", "Wood", 100);
        System.out.println("My second car's color is " + mySecondCar.color + " and its interior is " + mySecondCar.getInterior());
        Car myThirdCar = new Car("Blue", "Wood", 200);
        myThirdCar.setInterior("Steel");
        System.out.println("My second car's color is " + myThirdCar.color + " and its interior is " + myThirdCar.getInterior() + ". Its price is $" + Car.price);

        Car corolla = new Car("White", "Wood", 300);
        // Static variables are accessed using ClassName Dot Variable Name
        // always have one copy
        // That's why Both cars have same price $300.
        System.out.println("My car's color is " + corolla.color + " and its interior is " + corolla.getInterior() + ". Its price is $" + corolla.price);
        System.out.println("My second car's color is " + myThirdCar.color + " and its interior is " + myThirdCar.getInterior() + ". Its price is $" + Car.price);

    }
}
