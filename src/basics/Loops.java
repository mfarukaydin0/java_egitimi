package basics;

public class Loops {
    public static void main(String[] args) {

        // while loop
        int number = 1;

        while (number <= 5) {
            System.out.println("While: " + number);
            number++;
        }

        System.out.println();

        // do-while loop
        int count = 1;

        do {
            System.out.println("Count: " + count);
            count++;
        } while (count <= 5);

        System.out.println();

        // for loop
        for (int day = 1; day <= 7; day++) {
            System.out.println("Day " + day);
        }

        System.out.println();

        // Enhanced for loop
        String[] cities = {
                "Istanbul",
                "Sakarya",
                "Ordu",
                "Bursa",
                "Ankara"
        };

        for (String city : cities) {
            System.out.println(city);
        }
    }
}