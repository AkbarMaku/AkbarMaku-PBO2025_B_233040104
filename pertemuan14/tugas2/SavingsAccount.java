package pertemuan14.tugas2;

public class SavingsAccount extends BankAccount {

    public SavingsAccount(String accountNumber) {
        super(accountNumber);
    }

    // Ini akan menimbulkan error karena mencoba override method final
    // @Override
    // public void displayAccountInfo() {
    // System.out.println("Savings Account Info:");
    // super.displayAccountInfo(); // Panggil method parent (jika method bukan
    // final)
    // }

    // Solusi dari code di atas
    public void showDetailedAccountInfo() {
        System.out.println("=== Savings Account Details ===");
        super.displayAccountInfo(); // panggil method final dari superclass
        System.out.println("Interest Rate: 3.5% per year");
    }
}
