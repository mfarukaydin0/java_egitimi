package basics;

// Importing the Scanner class
import java.util.Scanner;

public class UserInput {
    public static void main(String[] args) {

        // Creating an object of Scanner class
        Scanner scanner = new Scanner(System.in);

        // Reading a String value
        // using nextLine() method
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

        // Reading an Integer number
        // using nextInt() method
        System.out.print("Enter your age: ");
        int age = scanner.nextInt();

        // Printing the user details
        System.out.println("Hello " + name);
        System.out.println("You are " + age + " years old");
    }
}