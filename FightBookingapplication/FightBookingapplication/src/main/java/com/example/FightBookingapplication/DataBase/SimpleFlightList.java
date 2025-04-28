package com.example.FightBookingapplication.DataBase;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.example.FightBookingapplication.Entity.Flight;

@Component
public class SimpleFlightList  implements FlightList {

    private List<Flight> listOfFlight = new ArrayList<>();

    public SimpleFlightList () {  // ✅ No arguments in constructor
        listOfFlight.add(new Flight("Fl001", "LA", "Stockholm"));
        listOfFlight.add(new Flight("Fl002", "LA", "Stockholm"));
        listOfFlight.add(new Flight("Fl003", "England", "Texas"));
        listOfFlight.add(new Flight("Fl004", "Goa", "Bengaluru"));
        listOfFlight.add(new Flight("Fl005", "Sydney", "Cambridge"));
        listOfFlight.add(new Flight("Fl006", "Wales", "Stockholm"));
        listOfFlight.add(new Flight("Fl007", "Michigan", "Stockholm"));
        listOfFlight.add(new Flight("Fl008", "New York", "Delhi"));
        listOfFlight.add(new Flight("Fl009", "Dallas", "Indore"));
        listOfFlight.add(new Flight("Fl010", "Hyderabad", "Stockholm"));
        listOfFlight.add(new Flight("Fl011", "London", "Stockholm"));
        listOfFlight.add(new Flight("Fl012", "UK", "LA"));
    }

    @Override
    public List<Flight> getAllFlight() {
        return listOfFlight;
    }
}
