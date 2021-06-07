package com.katiescode;
import java.text.NumberFormat;
import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        final byte MONTHS_IN_YEAR = 12;
        final byte PERCENT = 100;

        Scanner scanner = new Scanner(System.in);

        //Principal
        System.out.print("Principal: ");
        int principal = scanner.nextInt();

        //Annual Interest Rate
        System.out.print("Annual Interest Rate: ");
        float annualInterestRate = scanner.nextFloat();
        float monthlyInterest = annualInterestRate / PERCENT;

        //Period
        System.out.print("Period (Years): ");
        byte years = scanner.nextByte();
        int numberOfPayments = years * MONTHS_IN_YEAR;

        //Calculate mortgage
        double mortgage = principal
                    * (monthlyInterest * Math.pow(1 + monthlyInterest, numberOfPayments))
                    / (Math.pow(1 + monthlyInterest, numberOfPayments));

        System.out.println("Mortgage: " + NumberFormat.getCurrencyInstance().format(mortgage));

    }
}
