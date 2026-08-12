package oop;

class Printer {

    // Print text
    void print(String text) {
        System.out.println("Text: " + text);
    }

    // Print a number
    void print(int number) {
        System.out.println("Number: " + number);
    }

    // Print text multiple times
    void print(String text, int copies) {
        for (int i = 0; i < copies; i++) {
            System.out.println("Copy " + (i + 1) + ": " + text);
        }
    }
}

public class CompileTimePolymorphism {
    public static void main(String[] args) {

        Printer printer = new Printer();

        // Static binding: compiler chooses the method
        printer.print("Hello");
        printer.print(42);
        printer.print("Java", 2);
    }
}