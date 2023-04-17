package com.mykesoftware;

import java.text.NumberFormat;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int baseSalary =50_000;
        int extrHours = 10;
        int hourlyRate =20;
        int wage = calculateWage(baseSalary,extrHours,hourlyRate);
        System.out.println(wage);

    }

    public  static int calculateWage(
            int baseSalry,
            int extraHours,
            int hourlyRate

    ){
        return  baseSalry + (extraHours * hourlyRate);
    }


}
