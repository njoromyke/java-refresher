package com.mykesoftware;

public class TextBox extends UIControl {
    private String text = "";

    public  void setText(String text){
        this.text = text;
    }

    public void clear(){
        text= "";
    }
}
