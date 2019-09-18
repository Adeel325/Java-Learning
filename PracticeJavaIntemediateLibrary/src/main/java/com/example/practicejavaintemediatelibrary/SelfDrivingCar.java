package com.example.practicejavaintemediatelibrary;

public class SelfDrivingCar extends Car {
    public SelfDrivingCar(String selectedColor, String choosenInerior) {
        super(selectedColor, choosenInerior);
        System.out.println("This is self driving car");
    }
    @Override
    public void drive(){
        super.drive();
        System.out.println("Coming back to home.");
    }
}
