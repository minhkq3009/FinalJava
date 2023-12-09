package FinalJava1.Exercise1;

public class Bank {
    private double balance;
    private double annualInterestRate;

    // Constructor
    public Bank(double balance, double annualInterestRate) {
        this.balance = balance;
        this.annualInterestRate = annualInterestRate;
    }

    public double calculateInterest() {
        return balance * (annualInterestRate / 1200);
    }
}
