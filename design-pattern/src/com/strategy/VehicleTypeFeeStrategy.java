package com.strategy;

import java.time.Duration;
import java.util.Map;

public class VehicleTypeFeeStrategy implements FeeCalculationStrategy
{
    final Ticket ticket;
    Map<VehicleType,Double> feeMap = Map.of(
            VehicleType.MOTOR_BIKE,10.0,
            VehicleType.CAR,15.0,
            VehicleType.BUS,20.0,
            VehicleType.TRUCK,30.0);
    public VehicleTypeFeeStrategy(Ticket ticket)
    {
        this.ticket = ticket;
    }

    @Override
    public double calculateFee() {
        Duration duration = Duration.between(ticket.getEntryTimestamp(), ticket.getExitTimestamp());
        long hours = duration.toHours();
        return hours * feeMap.get(ticket.getVehicleType());
    }
}
