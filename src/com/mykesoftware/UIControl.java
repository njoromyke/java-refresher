package com.mykesoftware;

public abstract class UIControl {
    private  boolean isEnabled = true;

    public  void enable (){
        isEnabled = true;
    }

//    public UIControl(boolean isEnabled) {
//        this.isEnabled = isEnabled;
//    }
    public abstract void  render();
    public  void  disable(){
        isEnabled= false;
    }

    public boolean isEnabled() {
        return isEnabled;
    }

}
