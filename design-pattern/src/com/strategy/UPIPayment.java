package com.strategy;

public class UPIPayment implements PaymentMethod{
    @Override
    public void pay(double amount) {
        System.out.println("Payment of rupees "+amount+ " completed successfully through UPI");
    }
}
