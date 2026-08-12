package oop;

class Notification {

    // Send a notification
    void send(String message) {
        System.out.println("Sending notification: " + message);
    }
}

class EmailNotification extends Notification {

    // Override the parent method
    @Override
    void send(String message) {
        System.out.println("Sending EMAIL: " + message);
    }
}

class SmsNotification extends Notification {

    // Override the parent method
    @Override
    void send(String message) {
        System.out.println("Sending SMS: " + message);
    }
}

public class RuntimePolymorphism {
    public static void main(String[] args) {

        // Parent reference, different objects
        Notification notification1 = new EmailNotification();
        Notification notification2 = new SmsNotification();

        // Dynamic binding: method is chosen at runtime
        notification1.send("Order confirmed");
        notification2.send("Order confirmed");
    }
}