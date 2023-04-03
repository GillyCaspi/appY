package com.model;


import java.util.UUID;

public abstract class Vehicle {
    private final String type;
    private final String color;
    private final String plateNumber;
    private final long created;

    public Vehicle(String type, String color) {
        this.type = type;
        this.color = color;
        this.plateNumber = UUID.randomUUID().toString();;
        this.created = System.currentTimeMillis();
    }

    public String getType() {
        return type;
    }

    public String getColor() {
        return color;
    }

    public String getPlateNumber() {
        return plateNumber;
    }

    public long getCreated() {
        return created;
    }
}
