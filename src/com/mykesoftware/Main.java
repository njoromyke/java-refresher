package com.mykesoftware;

import java.text.NumberFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {

        String result = NumberFormat.getPercentInstance().format(0.4);


        System.out.println(result);


    }

}