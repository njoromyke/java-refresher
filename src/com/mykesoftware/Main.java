package com.mykesoftware;

public class Main {

    public static void main(String[] args) {
        var box1 = new TextBox();
        var box2 = box1;
        System.out.println(box2.toString());
    }
}
