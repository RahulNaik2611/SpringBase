package com.example.FightBookingapplication.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.FightBookingapplication.Entity.Flight;
import com.example.FightBookingapplication.Service.FlightService;

@Controller
public class FlightController {

    @Autowired
    private FlightService flightService;

    // Mapping to load the Search Page (GET request)
    @RequestMapping(value = "/search", method = RequestMethod.GET)
    public String searchFlight() {
        return "search";  // This will open search.jsp
    }

    // Mapping for searching flights (POST request)
    @RequestMapping(value = "/searchFlights", method = RequestMethod.POST)
    public String getSearchFlightResult(@RequestParam("source") String source,
                                        @RequestParam("destination") String destination,
                                        Model model) {

        // Get matching flights from the service
        List<Flight> flights = flightService.getFlightsBySourceAndDestination(source, destination);

        // Add flights into the Model to send to JSP
        model.addAttribute("flights", flights);

        // Return the name of the JSP page (without .jsp)
        return "Success";  // Means Success.jsp
    }
}
