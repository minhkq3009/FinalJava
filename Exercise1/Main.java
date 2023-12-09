package FinalJava1.Exercise1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the balance: ");
        double balance = scanner.nextDouble();

        System.out.print("Enter the annual interest rate: ");
        double annualInterestRate = scanner.nextDouble();

        Bank myBank = new Bank(balance, annualInterestRate);

        double monthlyInterest = myBank.calculateInterest();
        System.out.println("Monthly Interest: $" + monthlyInterest);

        // Close the Scanner
        scanner.close();
    }
}

