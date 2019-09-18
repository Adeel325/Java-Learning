package com.example.practicejavaintemediatelibrary;

public class Car {
    public String color = "Black";
    private String interior;
    public static int price;
    Car(){
        interior = "Plastic";
        price = 120;
    }
    Car(String selectedColor, String choosenInerior, int carPrice){
        color = selectedColor;
        interior = choosenInerior;
        price = carPrice;
    }

    public String getInterior() {
        return interior;
    }

    public void setInterior(String interior) {
        this.interior = interior;
    }
}
