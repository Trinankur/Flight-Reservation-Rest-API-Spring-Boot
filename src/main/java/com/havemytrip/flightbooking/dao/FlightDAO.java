package com.havemytrip.flightbooking.dao;

import com.havemytrip.flightbooking.model.Flight;

import java.util.List;

public interface FlightDAO {

    public List<Flight> getFlights();
    public Flight findById(int theId);
    public void saveFlight(Flight flight);
    public void deleteFlightById(int theId);
    public Flight findByFlightNum(String theFlightNum);

}
