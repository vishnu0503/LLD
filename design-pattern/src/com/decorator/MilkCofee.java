package com.decorator;

public class MilkCofee extends CoffeeDecorator{
    public MilkCofee(Coffee coffee) {
        super(coffee);
    }

    public String getName() {
        return super.getName() + "+" + "Milk coffee";
    }

    public double getCost() {
        return super.getCost()+10.00;
    }
}
