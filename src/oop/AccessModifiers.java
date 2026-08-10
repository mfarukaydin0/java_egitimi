package oop;

class AccessAccount {
    public String ownerName;
    private double balance;
    protected String accountType;
    String bankName;

    public AccessAccount(String ownerName, String accountType) {
        this.ownerName = ownerName;
        this.accountType = accountType;
        this.bankName = "Bank of America";
        this.balance = 0;
    }

    // Add money to the account
    public void deposit(double amount) {
        balance += amount;
    }

    // Get the private balance
    public double getBalance() {
        return balance;
    }
}

// Subclass to test protected and default access
class ForeignAccount extends AccessAccount {
    public ForeignAccount(String ownerName, String accountType) {
        super(ownerName, accountType);
    }

    public void showProtectedAndDefault() {
        // protected is accessible from subclass
        System.out.println("Account type (protected): " + accountType);

        // default is only accessible from same package
        System.out.println("Bank (default): " + bankName);
    }
}

public class AccessModifiers {
    public static void main(String[] args) {

        AccessAccount account = new AccessAccount("Faruk", "Checking");

        account.deposit(500);
        account.deposit(250);

        // Public variable
        System.out.println("Owner: " + account.ownerName);

        // Protected variable
        System.out.println("Account type: " + account.accountType);

        // Default variable
        System.out.println("Bank: " + account.bankName);

        // Private variable is accessed with a method
        System.out.println("Balance: $" + account.getBalance());

        System.out.println();
        ForeignAccount foreign = new ForeignAccount("Ayşe", "Savings");
        foreign.showProtectedAndDefault();
    }
}