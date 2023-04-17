package com.mykesoftware;

import java.text.NumberFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       String role = "Moderator";
       switch (role){
           case "Admin":
               System.out.println("You are an admin");
               break;

           case "Moderator":
               System.out.println("You are a moderator");
               break;

           default:
               System.out.println("You are a guest");
       }
    }
}