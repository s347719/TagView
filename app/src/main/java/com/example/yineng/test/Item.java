package com.example.yineng.test;

/**
 * Created by 舒欢
 * Created time: 2017/7/27
 * 作用：
 */

public class Item {
    private int colorCode;
    private String value;
    private boolean isValidData;
    private boolean isRealTime;


    public int getColorCode() {
        return colorCode;
    }

    public void setColorCode(int colorCode) {
        this.colorCode = colorCode;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public boolean isValidData() {
        return isValidData;
    }

    public void setValidData(boolean validData) {
        isValidData = validData;
    }

    public boolean isRealTime() {
        return isRealTime;
    }

    public void setRealTime(boolean realTime) {
        isRealTime = realTime;
    }
}
