package pertemuan14.tugas2;

public class BankAccount {
    private final String accountNumber;
    protected double balance;

    // Constructor
    public BankAccount(String accountNumber) {
        this.accountNumber = accountNumber;
        this.balance = 0.0;
    }

    // Method untuk menambah saldo
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        }
    }

    // Method final yang tidak bisa dioverride
    public final void displayAccountInfo() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Balance       : $" + balance);
    }
}
