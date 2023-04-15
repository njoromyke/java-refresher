package com.mykesoftware;

import java.text.NumberFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        final byte MONTHS_IN_YEAR = 12;
        final byte PERCENT = 100;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Principal: ");
        int principal = scanner.nextInt();

        System.out.print("Interest rate: ");
        float interest = scanner.nextFloat();
        float monthlyInterest = (interest / MONTHS_IN_YEAR) / PERCENT;


        System.out.print("Period (Years): ");
        byte period = scanner.nextByte();
        int numberOfPayments = period * MONTHS_IN_YEAR;

        double mortgage = principal * ((monthlyInterest * Math.pow((1+monthlyInterest),numberOfPayments)) / (Math.pow((1+ monthlyInterest),numberOfPayments)-1));

        NumberFormat currency = NumberFormat.getCurrencyInstance();
        String total = currency.format(mortgage);

        System.out.println("Mortgage: " + total);





    }



}