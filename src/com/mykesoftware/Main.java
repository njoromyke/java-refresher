package com.mykesoftware;

public class Main {

    public static void main(String[] args) {
        var calculator = new TaxCalculator2018(100);
        var report = new TaxReport(calculator);
    }
}
