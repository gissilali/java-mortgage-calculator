package com.company;

import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class MortgageController {
    String name;
    int lengthOfLoan;
    int downPayment;
    int costOfHome;

    public void runQuestionnaire() throws InterruptedException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hello what's your name?");
        String name = scanner.nextLine();
        System.out.println("Hello, " + name + ", welcome to the Mortgage calculator");
        TimeUnit.SECONDS.sleep(2);
        System.out.println("How long do you want your repayment period? (in years please...)");
        int lengthOfLoan = scanner.nextInt();
        System.out.println("How much is your down payment");
        int downPayment = scanner.nextInt();
        System.out.println("How much does the home cost?");
        int costOfHome = scanner.nextInt();

        System.out.println("How much does the home cost?");
    }

    public MortgageData calculate() {
        int principal = this.costOfHome - this.downPayment;
        double monthlyInterest = principal * Math.pow(5 * (1 + 5), this.lengthOfLoan) / (Math.pow(1 + 5, this.lengthOfLoan) - 1);
        return new MortgageData("Silali", (float) monthlyInterest, 20, 45);
    }
}
