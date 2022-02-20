package com.gitlab.StefanDeWolfe.Decorator;

public class IndianFood extends FoodDecorator {
    public IndianFood(Food newFood) {
        super(newFood);
    }
    public String prepareFood() {
        return super.prepareFood() +" with Basmati Rice and Chicken Curry. ";
    }
    public double foodPrice() {
        return super.foodPrice()+40;
    }
}
