package basics;

public class LoopControl {
    public static void main(String[] args) {

        // break
        for (int page = 1; page <= 10; page++) {

            if (page == 6) {
                System.out.println("Book finished.");
                break;
            }

            System.out.println("Reading page " + page);
        }

        System.out.println();

        // continue
        for (int number = 1; number <= 10; number++) {

            if (number % 2 == 0) {
                continue;
            }

            System.out.println("Number: " + number);
        }
    }
}