package com.havemytrip.flightbooking.dao;

import com.havemytrip.flightbooking.model.Flight;
import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;

import java.util.List;

@Repository
public class FlightDAOHibernateImpl implements FlightDAO{

    @Autowired
    private EntityManager entityManager;

    @Override
    public List<Flight> getFlights() {
        Session currentSession = entityManager.unwrap(Session.class);
        Query<Flight> theQuery = currentSession.createQuery("from Flight", Flight.class);

        List<Flight> flightList = theQuery.getResultList();
        return flightList;
    }

    @Override
    public Flight findById(int theId) {
        Session currentSession = entityManager.unwrap(Session.class);

        Flight theFlight = currentSession.get(Flight.class, theId);

        return theFlight;
    }

    @Override
    public void saveFlight(Flight theFlight) {
        Session currentSession = entityManager.unwrap(Session.class);
        currentSession.saveOrUpdate(theFlight);
    }

    @Override
    public void deleteFlightById(int theId) {
        Session currentSession = entityManager.unwrap(Session.class);
        Query theQuery = currentSession.createQuery("delete from Flight where id = :theId");

        theQuery.executeUpdate();
    }

    @Override
    public Flight findByFlightNum(String theFlightNum) {
        Session currentSession = entityManager.unwrap(Session.class);
        Flight theFlight = currentSession.get(Flight.class, theFlightNum);

        return theFlight;
    }
}
