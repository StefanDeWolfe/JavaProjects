package com.gitlab.StefanDeWolfe.Decorator;

public class VegetableFood implements Food {
    @Override
    public String prepareFood() {
        return "Cabbage";
    }

    @Override
    public double foodPrice() {
        return 5;
    }
}
