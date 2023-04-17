package com.mykesoftware;

import java.text.NumberFormat;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        var textbox1 = new TextBox();
        textbox1.setText("Box 1");

        System.out.println(textbox1.text.toUpperCase());

        var textBox2 = new TextBox();
        textBox2.setText("New Text Box");
        System.out.println(textBox2.text);
    }


}
