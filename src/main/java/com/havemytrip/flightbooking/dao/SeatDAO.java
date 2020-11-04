package com.havemytrip.flightbooking.dao;

import com.havemytrip.flightbooking.model.Seat;

import java.util.List;

public interface SeatDAO {
    public List<Seat> getAllSeats();
    public Seat getById(int theId);
    public void save(Seat theSeat);
    public void deleteById(int theId);
}
