package com.adapter;

public class PaymentClient {
    public static void main(String[] args) {
        PaymentGateway paymentGateway =  new PaypalGateway();
        System.out.println(paymentGateway.getName());

        System.out.println(paymentGateway.makePayment(1000));

        PaymentGateway paymentGateway1 =  new PaymentAdapter(new RazorPayGateway("RazorPay"));

        System.out.println(paymentGateway1.getName());
        System.out.println(paymentGateway1.makePayment(1000));
    }
}
