package oop;

// Interface
interface Printable {

    // Abstract method
    void print();

    // Default method
    default void printFooter() {
        System.out.println("End of document.");
    }
}

class Report implements Printable {

    // Implement the interface method
    @Override
    public void print() {
        System.out.println("Printing the report.");
    }
}

class Invoice implements Printable {

    // Implement the interface method
    @Override
    public void print() {
        System.out.println("Printing the invoice.");
    }
}

public class Interfaces {
    public static void main(String[] args) {

        Printable report = new Report();
        Printable invoice = new Invoice();

        report.print();
        report.printFooter();

        System.out.println();

        invoice.print();
        invoice.printFooter();
    }
}