package com.mykesoftware;

public class Main {

    public static void main(String[] args) {
       var control = new UIControl(true);
       var textbox = new TextBox();
       textbox.setText("Text box ");
    show(control);
    }

    public  static void show(UIControl control){
        if (control instanceof TextBox) {
            var textBox = (TextBox) control;
            textBox.setText("Hello box");
        }
        System.out.println(control);
    }
}
