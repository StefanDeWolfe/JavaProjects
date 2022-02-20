package com.gitlab.StefanDeWolfe.Adapter;

public class AdapterPatternExample {
    public static void main(String args[]) {
        CreditCard targetInterface = new BankCustomer();
        targetInterface.giveBankDetails();
        System.out.print(targetInterface.getCreditCard());
    }
}
