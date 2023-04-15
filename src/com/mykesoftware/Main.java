package com.mykesoftware;

import java.awt.*;
import java.util.Date;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        String message = "Hello World" + "John";

        System.out.println( message.replace("H","*"));
        System.out.println(message.trim());
    }

}