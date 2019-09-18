package com.example.practicejavaintemediatelibrary;

public class Car {
    public String color = "Black";
    private String interior;
    Car(){
        interior = "Plastic";
    }
    Car(String selectedColor, String choosenInerior){
        color = selectedColor;
        interior = choosenInerior;
    }

    public String getInterior() {
        return interior;
    }

    public void setInterior(String interior) {
        this.interior = interior;
    }
}
