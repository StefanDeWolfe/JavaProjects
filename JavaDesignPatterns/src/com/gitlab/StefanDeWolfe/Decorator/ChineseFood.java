package com.gitlab.StefanDeWolfe.Decorator;

public class ChineseFood extends FoodDecorator {
    public ChineseFood(Food newFood) {
        super(newFood);
    }
    public String prepareFood() {
        return super.prepareFood() +" with Fried Rice and Orange Chicken. ";
    }
    public double foodPrice() {
        return super.foodPrice()+35.0;
    }
}
