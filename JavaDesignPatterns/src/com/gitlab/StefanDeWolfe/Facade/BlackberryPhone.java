package com.gitlab.StefanDeWolfe.Facade;

public class BlackberryPhone implements MobileShop {

    @Override
    public void modelNo() {
        System.out.println(" Blackberry Z10 ");
    }

    @Override
    public void price() {
        System.out.println(" 499.99 ");
    }
}
