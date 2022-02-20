package com.gitlab.StefanDeWolfe.Facade;

public class ApplePhone implements MobileShop {
    @Override
    public void modelNo() {
        System.out.println(" iPhone 6 ");
    }
    @Override
    public void price() {
        System.out.println(" SRP 899.99 ");
    }
}
