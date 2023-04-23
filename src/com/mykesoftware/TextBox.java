package com.mykesoftware;

public final class TextBox extends UIControl {
    private String text = "";

    @Override
    public void render() {
        System.out.println("Render TextBox");
    }

//    public TextBox() {
//        super(true);
//    }

    @Override
    public String  toString (){
        return  text;
    }
    public  void setText(String text){
        this.text = text;
    }

    public void clear(){
        text= "";
    }
}
