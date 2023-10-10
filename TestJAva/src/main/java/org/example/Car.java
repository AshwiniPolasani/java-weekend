package org.example;

public class Car extends Vehicle{

    public Car(String color, int price) {
        super(color, price);
    }

    public int getCarPrice(){
        return price;
    }
}
