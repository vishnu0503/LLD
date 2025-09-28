package com.adapter;

public class PaymentAdapter implements PaymentGateway{
    RazorPayGateway razorPayGateway;
    public PaymentAdapter( RazorPayGateway razorPayGateway)
    {
       this.razorPayGateway = razorPayGateway;
    }

    @Override
    public String getName() {
        return razorPayGateway.getGatewayName();
    }

    @Override
    public String makePayment(int amount) {
        return razorPayGateway.pay(amount);
    }
}
