package com.havemytrip.flightbooking.dao;

import com.havemytrip.flightbooking.model.Ticket;

import java.util.List;

public interface TicketDAO {
    public List<Ticket> getAllTickets();
    public Ticket getById(int ticketId);
    public void save(Ticket theTicket);
    public void deleteById(int ticketId);
}
