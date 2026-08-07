package oop;

// Creating a class with methods
class BankAccount {
    String owner;
    double balance;

    // Displaying the current balance
    void showBalance() {
        System.out.println(owner + "'s balance: $" + balance);
    }

    // Adding money to the account
    void deposit(double amount) {
        balance += amount;
        System.out.println("$" + amount + " deposited.");
    }

    // Removing money from the account
    void withdraw(double amount) {
        balance -= amount;
        System.out.println("$" + amount + " withdrawn.");
    }
}

public class ClassMethods {
    public static void main(String[] args) {

        BankAccount account = new BankAccount();

        account.owner = "Faruk";
        account.balance = 1000;

        account.showBalance();

        account.deposit(250);
        account.showBalance();

        account.withdraw(100);
        account.showBalance();
    }
}