package com.gitlab.StefanDeWolfe.AbstractFactory;

public class SBI implements Bank {
    private final String BNAME;
    public SBI(){
        BNAME="SBI BANK";
    }
    @Override
    public String getBankName() {
        return null;
    }
}