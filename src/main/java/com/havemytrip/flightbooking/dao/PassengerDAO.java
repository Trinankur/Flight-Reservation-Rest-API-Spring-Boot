package com.havemytrip.flightbooking.dao;

import com.havemytrip.flightbooking.model.Passenger;

import java.util.List;

public interface PassengerDAO {
    public List<Passenger> getAllBookings();
    public Passenger getById(int theId);
    public void save(Passenger thePassenger);
    public void deleteById(int theId);
}
