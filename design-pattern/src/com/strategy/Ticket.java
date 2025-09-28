package com.strategy;

import java.time.LocalDateTime;

public class Ticket
{
    private String ticketId;
    private String userId;
    private VehicleType vehicleType;
    private String spotId;
    private LocalDateTime entryTimestamp;
    private LocalDateTime exitTimestamp;

    public Ticket(String ticketId, String userId, VehicleType vehicleType, String spotId, LocalDateTime entryTimestamp, LocalDateTime exitTimestamp) {
        this.ticketId = ticketId;
        this.userId = userId;
        this.vehicleType = vehicleType;
        this.spotId = spotId;
        this.entryTimestamp = entryTimestamp;
        this.exitTimestamp = exitTimestamp;
    }

    public String getTicketId() {
        return ticketId;
    }

    public String getUserId() {
        return userId;
    }

    public VehicleType getVehicleType() {
        return vehicleType;
    }

    public String getSpotId() {
        return spotId;
    }

    public LocalDateTime getEntryTimestamp() {
        return entryTimestamp;
    }

    public LocalDateTime getExitTimestamp() {
        return exitTimestamp;
    }
}
