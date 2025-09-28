package com.strategy;

public class PaymentProcessor
{
    final FeeCalculationStrategy feeCalculationStrategy;
    final PaymentMethod paymentMethod;

    public PaymentProcessor(FeeCalculationStrategy feeCalculationStrategy,PaymentMethod paymentMethod)
    {
        this.feeCalculationStrategy = feeCalculationStrategy;
        this.paymentMethod = paymentMethod;
    }

    public void processPayment()
    {
        double amount = feeCalculationStrategy.calculateFee();
        System.out.println("Total price for this ticket is "+ amount);
        paymentMethod.pay(amount);
    }
}
