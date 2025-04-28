package com.example.FightBookingapplication.Entity;

public class Flight 
{
    private String flightNo;
    private String source;
    private String destination;

    // ✅ No-arg constructor
    public Flight() {
    }

    // ✅ All-arg constructor
    public Flight(String flightNo, String source, String destination) {
        this.flightNo = flightNo;
        this.source = source;
        this.destination = destination;
    }

    // ✅ Getters and Setters
    public String getFlightNo() {
        return flightNo;
    }

    public void setFlightNo(String flightNo) {
        this.flightNo = flightNo;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }
}
