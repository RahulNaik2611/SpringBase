package com.example.FightBookingapplication.Repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.example.FightBookingapplication.DataBase.FlightList;
import com.example.FightBookingapplication.Entity.Flight;

@Repository
public class FlightRepository {

    @Autowired
    private FlightList flightList;

    public List<Flight> getAllFlight() {
        return flightList.getAllFlight();  // <-- You missed calling the method
    }
}
