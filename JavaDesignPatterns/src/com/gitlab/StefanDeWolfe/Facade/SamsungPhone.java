package com.gitlab.StefanDeWolfe.Facade;

public class SamsungPhone implements MobileShop{
    @Override
    public void modelNo() {
        System.out.println(" Samsung Galaxy S21+ ");
    }
    @Override
    public void price() {
        System.out.println(" SRP 799.99 ");
    }
}
