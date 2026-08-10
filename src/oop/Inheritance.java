package oop;

class Employee {
    protected String name;
    protected double salary;

    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    // Show employee information
    public void showInfo() {
        System.out.println("Name: " + name);
        System.out.println("Salary: $" + salary);
    }
}

class Manager extends Employee {

    public Manager(String name, double salary) {
        super(name, salary);
    }

    // Show manager's job
    public void manageTeam() {
        System.out.println(name + " is managing the team.");
    }
}

public class Inheritance {
    public static void main(String[] args) {

        Manager manager = new Manager("Faruk", 3000);

        // Use inherited method
        manager.showInfo();

        // Use manager's own method
        manager.manageTeam();
    }
}