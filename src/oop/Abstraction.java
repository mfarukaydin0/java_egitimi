package oop;

// Abstract class
abstract class Payment {

    // Abstract method
    abstract void processPayment(double amount);

    // Normal method
    void printReceipt(double amount) {
        System.out.println("Receipt: $" + amount + " processed");
    }
}

class CreditCardPayment extends Payment {

    // Implement the abstract method
    @Override
    void processPayment(double amount) {
        System.out.println("Processing $" + amount + " via Credit Card");
    }
}

class BankTransferPayment extends Payment {

    // Implement the abstract method
    @Override
    void processPayment(double amount) {
        System.out.println("Processing $" + amount + " via Bank Transfer");
    }
}

public class Abstraction {
    public static void main(String[] args) {

        Payment payment1 = new CreditCardPayment();
        Payment payment2 = new BankTransferPayment();

        payment1.processPayment(100);
        payment1.printReceipt(100);

        System.out.println();

        payment2.processPayment(50);
        payment2.printReceipt(50);
    }
}