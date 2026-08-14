package oop;

import java.util.ArrayList;

public class Packages {
    public static void main(String[] args) {

        // ArrayList comes from java.util
        ArrayList<String> topics = new ArrayList<>();

        topics.add("Interfaces");
        topics.add("Packages");

        System.out.println("Topics: " + topics);
        System.out.println("This class belongs to package: oop");
    }
}