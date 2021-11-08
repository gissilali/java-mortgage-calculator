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

        this.downPayment = downPayment;
        this.costOfHome = costOfHome;
        this.lengthOfLoan = lengthOfLoan;
        this.name = name;

        MortgageData mortgageData = this.calculate();

        System.out.println("Monthly payments is: - " + mortgageData.getMonthlyPayments());
    }

    public MortgageData calculate() {
        float percentageRate = 5;
        float rate = (percentageRate / 100) / 12;
        int principal = this.getPrincipal();
        int months = this.getLengthOfLoanInMonths();
        double monthlyPayment = ((int)(principal * rate) * (Math.pow((1 + rate), months)))/((Math.pow(1+rate, months)) - 1);
        double totalPayment = monthlyPayment * (months);
        double totalInterest = totalPayment - principal;
        return new MortgageData(monthlyPayment, totalPayment, totalInterest);
    }

    int getLengthOfLoanInMonths() {
        return this.lengthOfLoan * 12;
    }

    int getPrincipal() {
        return this.costOfHome - this.downPayment;
    }
}
