package com.company;

public class MortgageData {
    String name;
    int lengthOfLoan;
    int downPayment;
    int costOfHome;

    MortgageData(String name, float monthlyPayments, int downPayment,  int costOfHome) {
        this.costOfHome = costOfHome;
        this.lengthOfLoan = lengthOfLoan;
        this.name = name;
        this.downPayment = downPayment;
    }
}
