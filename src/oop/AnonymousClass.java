package oop;

interface Greeting {
    void sayHello();
}

public class AnonymousClass {
    public static void main(String[] args) {

        // Anonymous class
        Greeting greeting = new Greeting() {
            @Override
            public void sayHello() {
                System.out.println("Hello!");
            }
        };

        greeting.sayHello();
    }
}