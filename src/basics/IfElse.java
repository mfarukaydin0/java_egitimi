package basics;

public class IfElse {
    public static void main(String[] args) {

        int age = 24;
        int score = 64;
        double temperature = 27.5;

        // simple if
        if (age >= 18) {
            System.out.println("You can get a driver's license.");
        }

        System.out.println();

        // if-else
        if (score >= 50) {
            System.out.println("Exam result: Passed");
        } else {
            System.out.println("Exam result: Failed");
        }

        System.out.println();

        // else-if
        if (score >= 90) {
            System.out.println("Grade: A");
        } else if (score >= 80) {
            System.out.println("Grade: B");
        } else if (score >= 70) {
            System.out.println("Grade: C");
        } else if (score >= 60) {
            System.out.println("Grade: D");
        } else {
            System.out.println("Grade: F");
        }

        System.out.println();

        // nested if
        if (age >= 18) {
            if (temperature >= 25) {
                System.out.println("Perfect day.");
            } else {
                System.out.println("Weather is a little cold.");
            }
        }
    }
}