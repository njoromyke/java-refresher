package com.mykesoftware;

public class UIControl {
    private  boolean isEnabled = true;

    public  void enable (){
        isEnabled = true;
    }

//    public UIControl(boolean isEnabled) {
//        this.isEnabled = isEnabled;
//    }
    public void  render(){

    }
    public  void  disable(){
        isEnabled= false;
    }

    public boolean isEnabled() {
        return isEnabled;
    }

}
