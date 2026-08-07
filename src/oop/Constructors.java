package oop;

// Creating a class with a constructor
class Product {
    String name;
    double price;

    // Constructor
    Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    // Displaying product information
    void showInfo() {
        System.out.println("Product: " + name);
        System.out.println("Price: " + price + " TL");
    }
}

public class Constructors {
    public static void main(String[] args) {

        Product product1 = new Product("Keyboard", 1200);
        Product product2 = new Product("Mouse", 650);

        product1.showInfo();

        System.out.println();

        product2.showInfo();
    }
}