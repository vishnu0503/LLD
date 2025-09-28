package com.decorator;

public class SugarCoffee extends CoffeeDecorator{

    public SugarCoffee(Coffee coffee) {
        super(coffee);
    }

    public String getName() {
        return super.getName() + "+" + "Sugar Coffee";
    }

    public double getCost() {
        return super.getCost()+5.00;
    }
}
