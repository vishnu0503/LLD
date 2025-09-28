package com.decorator;

public class CoffeeDecorator implements Coffee{

    Coffee coffee;
    public CoffeeDecorator(Coffee coffee)
    {
        this.coffee = coffee;
    }

    @Override
    public String getName() {
        return coffee.getName();
    }

    @Override
    public double getCost() {
        return coffee.getCost();
    }
}
