package com.havemytrip.flightbooking.service;

import com.havemytrip.flightbooking.dao.FlightDAO;
import com.havemytrip.flightbooking.model.Flight;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class FlightServiceImpl implements FlightService{

    @Autowired
    private FlightDAO flightDAO;

    @Override
    @Transactional
    public List<Flight> getFlights() {
        return flightDAO.getFlights();
    }

    @Override
    @Transactional
    public Flight findById(int theId) {
        return flightDAO.findById(theId);
    }

    @Override
    @Transactional
    public void saveFlight(Flight theFlight) {
        flightDAO.saveFlight(theFlight);
    }

    @Override
    @Transactional
    public void deleteFlightById(int theId) {
        flightDAO.deleteFlightById(theId);
    }

    @Override
    @Transactional
    public Flight findByFlightNum(String theFlightNum) {
        return flightDAO.findByFlightNum(theFlightNum);
    }

}
