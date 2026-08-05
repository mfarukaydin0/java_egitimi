package basics;

public class Operators {
    public static void main(String[] args) {

        int age = 20;
        double temperature = 28.5;
        boolean isStudent = true;

        System.out.println("Age: " + age);
        System.out.println("Temperature: " + temperature);
        System.out.println("Student: " + isStudent);

        // Arithmetic Operators
        System.out.println();

        System.out.println("Age + 5 = " + (age + 5));
        System.out.println("Age - 2 = " + (age - 2));
        System.out.println("Age * 2 = " + (age * 2));

        // Use 2.0 to get a decimal result
        System.out.println("Age / 2.0 = " + (age / 2.0));
        System.out.println("Age % 3 = " + (age % 3));

        System.out.println("Temperature + 5 = " + (temperature + 5));
        System.out.println("Temperature - 3 = " + (temperature - 3));
        System.out.println("Temperature * 2 = " + (temperature * 2));
        System.out.println("Temperature / 2 = " + (temperature / 2));

        // Assignment Operators
        System.out.println();

        age += 1;
        temperature += 2.5;

        System.out.println("New age: " + age);
        System.out.println("New temperature: " + temperature);

        age *= 2;
        temperature -= 2;

        System.out.println("Age after *= 2: " + age);
        System.out.println("Temperature after -= 2: " + temperature);

        // Relational Operators
        System.out.println();

        System.out.println("Age > 18: " + (age > 18));
        System.out.println("Age == 21: " + (age == 21));
        System.out.println("Temperature >= 30: " + (temperature >= 30));
        System.out.println("Temperature != 25: " + (temperature != 25));

        // Logical Operators
        System.out.println();

        System.out.println("Age > 18 && isStudent: " + (age > 18 && isStudent));
        System.out.println("Temperature > 30 || isStudent: " + (temperature > 30 || isStudent));
        System.out.println("!isStudent: " + (!isStudent));

        // Unary Operators
        System.out.println();

        System.out.println("Current age: " + age);

        age++;
        System.out.println("After age++: " + age);

        ++age;
        System.out.println("After ++age: " + age);

        temperature--;
        System.out.println("After temperature--: " + temperature);

        // Operator Precedence
        System.out.println();

        System.out.println("5 + 3 * 2 = " + (5 + 3 * 2));
        System.out.println("(5 + 3) * 2 = " + ((5 + 3) * 2));

        // Bitwise Operators
        System.out.println();

        int firstNumber = 5;  // Binary: 0101
        int secondNumber = 3; // Binary: 0011

        System.out.println("5 & 3 = " + (firstNumber & secondNumber));
        System.out.println("5 | 3 = " + (firstNumber | secondNumber));
        System.out.println("5 ^ 3 = " + (firstNumber ^ secondNumber));
        System.out.println("~5 = " + (~firstNumber));
        System.out.println("5 << 1 = " + (firstNumber << 1));
        System.out.println("5 >> 1 = " + (firstNumber >> 1));

    }
}