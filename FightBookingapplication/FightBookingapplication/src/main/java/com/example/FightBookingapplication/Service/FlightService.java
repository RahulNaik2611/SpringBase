package com.example.FightBookingapplication.Service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.FightBookingapplication.Entity.Flight;
import com.example.FightBookingapplication.Repository.FlightRepository;

@Service
public class FlightService {

    @Autowired
    private FlightRepository flightRepository;

    // Method to filter flights based on source and destination
    public List<Flight> getFlightsBySourceAndDestination(String source, String destination) {
        // Filtering flights and returning the list
        return flightRepository.getAllFlight().stream()
                .filter(flight -> flight.getSource().equalsIgnoreCase(source) 
                        && flight.getDestination().equalsIgnoreCase(destination))
                .collect(Collectors.toList()); // collect the filtered results into a list
    }
}
