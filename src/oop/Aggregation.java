package oop;

class Engine {
    String type;

    Engine(String type) {
        this.type = type;
    }
}

class Vehicle {
    String brand;
    Engine engine;

    Vehicle(String brand, Engine engine) {
        this.brand = brand;
        this.engine = engine;
    }

    // Show vehicle information
    void showInfo() {
        System.out.println("Brand: " + brand);
        System.out.println("Engine: " + engine.type);
    }
}

public class Aggregation {
    public static void main(String[] args) {

        Engine engine = new Engine("1.6 Multijet");

        // Same engine used by two vehicles
        Vehicle vehicle1 = new Vehicle("Fiat Egea", engine);
        Vehicle vehicle2 = new Vehicle("Fiat Doblo", engine);

        vehicle1.showInfo();
        System.out.println();
        vehicle2.showInfo();

        // Engine still exists on its own
        System.out.println();
        System.out.println("Shared engine: " + engine.type);
    }
}