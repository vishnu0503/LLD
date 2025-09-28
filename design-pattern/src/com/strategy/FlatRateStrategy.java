package com.strategy;

import java.time.Duration;

public class FlatRateStrategy implements FeeCalculationStrategy
{
    final Ticket ticket;
    final double RATE_PER_HOUR = 10.0;
    public FlatRateStrategy(Ticket ticket)
    {
        this.ticket = ticket;
    }

    @Override
    public double calculateFee() {
        Duration duration = Duration.between(ticket.getEntryTimestamp(), ticket.getExitTimestamp());
        long hours = duration.toHours();
        return hours*RATE_PER_HOUR;
    }
}
