package com.gitlab.StefanDeWolfe.Factory;

public abstract class Plan {
    protected double rate;
    protected abstract void getRate();

    public void calculateBill(int units){
        System.out.println(units*rate);
    }
}
