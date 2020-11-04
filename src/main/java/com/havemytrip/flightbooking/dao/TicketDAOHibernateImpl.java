package com.havemytrip.flightbooking.dao;

import com.havemytrip.flightbooking.model.Passenger;
import com.havemytrip.flightbooking.model.Ticket;
import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import java.util.List;

@Repository
public class TicketDAOHibernateImpl implements TicketDAO {

    @Autowired
    private EntityManager entityManager;

    @Override
    @Transactional
    public List<Ticket> getAllTickets() {

        Session currentSession = entityManager.unwrap(Session.class);
        Query<Ticket> theQuery = currentSession.createQuery("from Ticket", Ticket.class);

        List<Ticket> ticketList = theQuery.getResultList();

        return ticketList;
    }

    @Override
    @Transactional
    public Ticket getById(int ticketId) {

        Session currentSession = entityManager.unwrap(Session.class);
        Ticket theTicket = currentSession.get(Ticket.class, ticketId);
        return theTicket;
    }

    @Override
    @Transactional
    public void save(Ticket theTicket) {
        Session currentSession = entityManager.unwrap(Session.class);
        currentSession.saveOrUpdate(theTicket);
    }

    @Override
    @Transactional
    public void deleteById(int ticketId) {
        Session currentSession = entityManager.unwrap(Session.class);
        Query theQuery = currentSession.createQuery("delete from Ticket where id = :ticketId", Ticket.class);

        theQuery.setParameter("ticketId", ticketId);

        theQuery.executeUpdate();
    }
}
