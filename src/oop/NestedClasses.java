package oop;

class Outer {
    private String secret = "Outer's secret";

    // Inner class
    class Inner {
        void showSecret() {
            System.out.println("Inner class sees: " + secret);
        }
    }

    // Static nested class
    static class StaticNested {
        void show() {
            System.out.println("Static nested class.");
        }
    }

    // Local inner class
    void showLocalClass() {
        class Local {
            void show() {
                System.out.println("Local class sees: " + secret);
            }
        }

        Local local = new Local();
        local.show();
    }
}

public class NestedClasses {
    public static void main(String[] args) {

        // Inner class
        Outer outer = new Outer();
        Outer.Inner inner = outer.new Inner();
        inner.showSecret();

        System.out.println();

        // Static nested class
        Outer.StaticNested nested = new Outer.StaticNested();
        nested.show();

        System.out.println();

        // Local inner class
        outer.showLocalClass();
    }
}