package com.company;

import java.text.DecimalFormat;

public class MortgageData {
    private double monthlyPayments;
    private double totalInterest;
    private double totalAmount;


    public MortgageData(double monthlyPayments, double totalInterest, double totalAmount) {
        this.monthlyPayments = monthlyPayments;
        this.totalInterest = totalInterest;
        this.totalAmount = totalAmount;
    }

    public double getTotalInterest() {
        return totalInterest;
    }

    public void setTotalInterest(double totalInterest) {
        this.totalInterest = totalInterest;
    }

    public double getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(double totalAmount) {
        this.totalAmount = totalAmount;
    }

    public double getMonthlyPayments() {
        return (Math.round(monthlyPayments * 100.0)/100.0);
    }

    public void setMonthlyPayments(double monthlyPayments) {
        this.monthlyPayments = monthlyPayments;
    }
}

