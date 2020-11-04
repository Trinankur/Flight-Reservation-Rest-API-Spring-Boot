package com.havemytrip.flightbooking.service;

import com.havemytrip.flightbooking.model.Flight;

import java.util.List;

public interface FlightService {
    public List<Flight> getFlights();
    public Flight findById(int theId);
    public void saveFlight(Flight flight);
    public void deleteFlightById(int theId);
    public Flight findByFlightNum(String theFlightNum);
}
