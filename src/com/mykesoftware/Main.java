package com.mykesoftware;

import java.text.NumberFormat;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        var textbox1 = new TextBox();
        var textbox2 = textbox1;
        textbox2.setText("Hello world");
        System.out.println(textbox1.text);
    }


}
