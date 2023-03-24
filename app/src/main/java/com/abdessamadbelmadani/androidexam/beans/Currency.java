package com.abdessamadbelmadani.androidexam.beans;

public class Currency {

    private String Code;
    private double value;

    public Currency(String code, double value) {
        Code = code;
        this.value = value;
    }

    public String getCode() {
        return Code;
    }

    public void setCode(String code) {
        Code = code;
    }

    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }
}
