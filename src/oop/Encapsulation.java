package oop;

// Private fields can only be accessed through methods
class Student {
    private String name;
    private int grade;

    public Student(String name, int grade) {
        this.name = name;
        setGrade(grade);
    }

    public String getName() {
        return name;
    }

    public int getGrade() {
        return grade;
    }

    // Check the grade before saving it
    public void setGrade(int grade) {
        if (grade >= 0 && grade <= 100) {
            this.grade = grade;
        } else {
            System.out.println("Invalid grade. Use 0-100.");
            this.grade = 0;
        }
    }
}

public class Encapsulation {
    public static void main(String[] args) {

        Student student1 = new Student("Faruk", 74);
        System.out.println(student1.getName() + ": " + student1.getGrade());

        // Try an invalid grade
        student1.setGrade(150);
        System.out.println(student1.getName() + ": " + student1.getGrade());
    }
}