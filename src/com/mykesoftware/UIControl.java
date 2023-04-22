package com.mykesoftware;

public class UIControl {
    private  boolean isEnabled = true;

    public  void enable (){
        isEnabled = true;
    }

    public UIControl(boolean isEnabled) {
        this.isEnabled = isEnabled;
        System.out.println("UI Control");
    }

    public  void  disable(){
        isEnabled= false;
    }

    public boolean isEnabled() {
        return isEnabled;
    }

}
