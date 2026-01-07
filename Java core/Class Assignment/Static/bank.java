import java.util.Scanner;

class BankAccount {
    int accNumber;
    String accHolderName;
    double currentBalance;
    static double interestRate = 10.5;

    // Default constructor
    BankAccount() {
        this.accNumber = 0;
        this.accHolderName = "Unknown";
        this.currentBalance = 0.0;
    }

    // Constructor
    BankAccount(int accNumber, String accHolderName, double currentBalance) {
        this.accNumber = accNumber;
        this.accHolderName = accHolderName;
        this.currentBalance = currentBalance;
    }

    // Setters
    void setAccNumber(int accNumber) {
        this.accNumber = accNumber;
    }

    void setAccHolderName(String accHolderName) {
        this.accHolderName = accHolderName;
    }

    void setCurrentBalance(double currentBalance) {
        this.currentBalance = currentBalance;
    }

    void setInterestRate(double interestRate) {
        BankAccount.interestRate = interestRate;
    }

    // Getters
    int getAccNumber() {
        return this.accNumber;
    }

    String getAccHolderName() {
        return this.accHolderName;
    }

    double getCurrentBalance() {
        return this.currentBalance;
    }

    double getInterestRate() {
        return this.interestRate;
    }

    // Display account info
    void displayInfo() {
        System.out.println("Account Number: " + this.accNumber);
        System.out.println("Account Holder Name: " + this.accHolderName);
        System.out.println("Current Balance: " + this.currentBalance);
        System.out.println("Interest Rate: " + BankAccount.interestRate + "%");
    }

}// BankAccount class Ends here

class BankTest {
    public static void main(String[] args) {
        BankAccount b1 = new BankAccount(12345, "Rutuj", 50000.75);
        BankAccount b2 = new BankAccount(45678, "Sam", 30000.50);
        BankAccount b3 = new BankAccount(78901, "Amit", 20000.00);

        b3.displayInfo();
        b2.displayInfo();
        b1.displayInfo();

        // Scanner sc = new Scanner(System.in);
        // System.out.print("Enter Account Number: ");
        // int a = sc.nextInt();
        // sc.nextLine(); // consume newline
        // System.out.print("Enter Account Holder Name: ");
        // String b = sc.nextLine();
        // System.out.print("Enter Current Balance: ");
        // double c = sc.nextDouble();

        // System.out.print("Enter Interest Rate: ");
        // double d = sc.nextDouble();

        // System.out.println("----- Account Details -----");
        // acc.displayInfo();

        // acc.setAccNumber(a);
        // acc.setAccHolderName(b);
        // acc.setCurrentBalance(c);
        // acc.setInterestRate(d);

        // System.out.println("Updated AccNumber: " + acc.getAccNumber());
        // System.out.println("Updated Name: " + acc.getAccHolderName());
        // System.out.println("Updated Balance: " + acc.getCurrentBalance());
        // System.out.println("Updated Interest Rate: " + acc.getInterestRate() + "%");
    }
}