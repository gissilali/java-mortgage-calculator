package com.company;

import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class Main {

    public static void main(String[] args) throws InterruptedException {
        MortgageController mortgage = new MortgageController();
        mortgage.runQuestionnaire();
    }
}
