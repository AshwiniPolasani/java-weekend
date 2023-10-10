package org.example;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/*Create one Java class named “Vehicle”. One private member: String color; and one public member: int price.
Create a subclass “Car” another one “Truck”. Create a method in Car that returns the price.
Create another class “TestVehicle” it should contain a main method. Instantiate two Vehicle objects, one is type Car and the other Truck.  */
public class TestVehicle {
    public static void main(String[] args) {

        Car car = new Car("Red", 25000);
        Truck truck = new Truck("Blue", 75000);

        System.out.println("Car price: " + car.getCarPrice());
        System.out.println("Truck price " + truck.price);


        //System.out.println("Result: " + Arrays.toString(uniqueKeys));
    }
}