package com.mykesoftware;

import java.text.NumberFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
      String[] fruits = {"Apple","Orange","Mango"};
      for (int i =0; i < fruits.length; i++){
          System.out.println(fruits[i]);
      }

      for (String fruit : fruits){
          System.out.println(fruit);
      }
    }
}