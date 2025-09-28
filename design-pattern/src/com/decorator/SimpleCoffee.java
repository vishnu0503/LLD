package com.decorator;

public class SimpleCoffee implements Coffee{

    @Override
    public String getName() {
        return "Simple Coffee";
    }

    @Override
    public double getCost() {
        return 20.00;
    }
}
