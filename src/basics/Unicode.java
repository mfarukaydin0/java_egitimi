package basics;

public class Unicode {
    public static void main(String[] args) {

        // Method 1: Normal character
        char directChar = 'A';

        // Method 2: Unicode format
        char unicodeChar = '\u0041';

        // Printing the results
        System.out.println("Normal: " + directChar);
        System.out.println("Unicode: " + unicodeChar);

        // Extra: Unicode for symbols
        char heart = '\u2764';
        System.out.println("Symbol: " + heart);
    }
}