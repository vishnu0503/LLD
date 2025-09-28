package com.strategy;

import java.time.LocalDateTime;

public class PaymentProcessorClient {
    public static void main(String[] args) {
        Ticket ticket = new Ticket("1","10",VehicleType.CAR,"2F1", LocalDateTime.now(),LocalDateTime.now().plusHours(2));
        PaymentProcessor paymentProcessor = new PaymentProcessor(new FlatRateStrategy(ticket),new UPIPayment());
        paymentProcessor.processPayment();

        paymentProcessor = new PaymentProcessor(new VehicleTypeFeeStrategy(ticket),new CardPayment());
        paymentProcessor.processPayment();
    }
}
