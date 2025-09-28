package com.strategy;

public class CardPayment implements PaymentMethod{
    @Override
    public void pay(double amount) {
        System.out.println("Payment of rupees "+amount+ " completed successfully through Card");
    }
}
