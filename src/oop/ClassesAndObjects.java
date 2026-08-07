package oop;

// Creating a class
class Car {
    String brand;
    String color;
    int year;
}

public class ClassesAndObjects {
    public static void main(String[] args) {

        // Creating objects
        Car car1 = new Car();
        car1.brand = "Fiat Egea";
        car1.color = "Red";
        car1.year = 2020;

        Car car2 = new Car();
        car2.brand = "Toyota Corolla";
        car2.color = "White";
        car2.year = 2022;

        System.out.println("Car 1:");
        System.out.println("Brand: " + car1.brand);
        System.out.println("Color: " + car1.color);
        System.out.println("Year: " + car1.year);

        System.out.println();

        System.out.println("Car 2:");
        System.out.println("Brand: " + car2.brand);
        System.out.println("Color: " + car2.color);
        System.out.println("Year: " + car2.year);
    }
}