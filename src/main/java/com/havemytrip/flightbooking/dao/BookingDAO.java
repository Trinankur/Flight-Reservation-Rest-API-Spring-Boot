package com.havemytrip.flightbooking.dao;

import com.havemytrip.flightbooking.model.Booking;

import java.util.List;

public interface BookingDAO {
    public List<Booking> getAllBookings();
    public Booking getById(int bookingId);
    public void save(Booking theBooking);
    public void deleteById(int bookingId);
    public List<Booking> getByUserId(int theId);
}
