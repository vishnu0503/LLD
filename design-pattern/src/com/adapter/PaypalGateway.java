package com.adapter;

public class PaypalGateway implements PaymentGateway{

    @Override
    public String getName() {
        return "Paypal";
    }

    @Override
    public String makePayment(int amount) {
        return "Paying amount by "+getName()+" for amount "+amount;
    }
}
