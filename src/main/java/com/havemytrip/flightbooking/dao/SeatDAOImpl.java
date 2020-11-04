package com.havemytrip.flightbooking.dao;

import com.havemytrip.flightbooking.model.Seat;
import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import java.util.List;

@Repository
public class SeatDAOImpl implements SeatDAO{

    @Autowired
    private EntityManager entityManager;

    @Override
    @Transactional
    public List<Seat> getAllSeats() {
        Session currentSession = entityManager.unwrap(Session.class);
        Query<Seat> theQuery = currentSession.createQuery("from Seat", Seat.class);
        List<Seat> seatList = theQuery.getResultList();
        return seatList;
    }

    @Override
    @Transactional
    public Seat getById(int theId) {
        Session currentSession = entityManager.unwrap(Session.class);
        Seat theSeat = currentSession.get(Seat.class, theId);
        return theSeat;
    }

    @Override
    @Transactional
    public void save(Seat theSeat) {
        Session currentSession = entityManager.unwrap(Session.class);
        currentSession.saveOrUpdate(theSeat);
    }

    @Override
    @Transactional
    public void deleteById(int theId) {
        Session currentSession = entityManager.unwrap(Session.class);
        Query theQuery = currentSession.createQuery("delete from Seat where id = :seatId", Seat.class);
        theQuery.setParameter("seatId", theId);
        theQuery.executeUpdate();
    }
}
