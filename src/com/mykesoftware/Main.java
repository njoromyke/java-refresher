package com.mykesoftware;

import java.text.NumberFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int temperature = 12;
        if(temperature > 30) {
            System.out.println("It is a hot day");
            System.out.println("'Drink water'");
        }
        else if (temperature > 20)
            System.out.println("Beautiful day");
         else
            System.out.println("Cold day!");




    }
}