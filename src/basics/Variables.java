package basics;

public class Variables {
    public static void main(String[] args) {

        String name = "Faruk";
        int age = 20;
        double height = 1.75;
        boolean isStudent = true;
        String city = "Istanbul";

        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Height: " + height + " m");
        System.out.println("Student: " + isStudent);
        System.out.println("City: " + city);

        // Changing variable values
        age = 21;
        height = 1.76;

        System.out.println();
        System.out.println("After updating variables:");
        System.out.println("New age: " + age);
        System.out.println("New height: " + height + " m");
    }
}