package com.adapter;

public interface PaymentGateway {
    public String getName();
    public String makePayment(int amount);
}
