package com.decorator;

public class CoffeeVendingMachine {
    public static void main(String[] args) {
        Coffee coffee = new SimpleCoffee();

        System.out.println(coffee.getName());
        System.out.println(coffee.getCost());

        coffee = new MilkCofee(coffee);
        System.out.println(coffee.getName());
        System.out.println(coffee.getCost());

        coffee =  new SugarCoffee(coffee);
        System.out.println(coffee.getName());
        System.out.println(coffee.getCost());
    }
}
