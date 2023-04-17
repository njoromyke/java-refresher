package com.mykesoftware;

import java.text.NumberFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = "";


     while(!input.equals("quit")){
         System.out.println("Input: ");
         input = scanner.next().toLowerCase();
         System.out.println(input);
     }
    }
}