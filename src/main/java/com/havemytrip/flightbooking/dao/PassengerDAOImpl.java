package com.havemytrip.flightbooking.dao;

import com.havemytrip.flightbooking.model.Booking;
import com.havemytrip.flightbooking.model.Passenger;
import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import java.util.List;

@Repository
public class PassengerDAOImpl implements PassengerDAO{

    @Autowired
    private EntityManager entityManager;

    @Override
    @Transactional
    public List<Passenger> getAllBookings() {
        Session currentSession = entityManager.unwrap(Session.class);

        Query<Passenger> theQuery = currentSession.createQuery("from Passenger", Passenger.class);

        List<Passenger> passengerList = theQuery.getResultList();

        return passengerList;
    }

    @Override
    @Transactional
    public Passenger getById(int theId) {
        Session currentSession = entityManager.unwrap(Session.class);

        Passenger thePassenger = currentSession.get(Passenger.class, theId);

        return thePassenger;
    }

    @Override
    @Transactional
    public void save(Passenger thePassenger) {
        Session currentSession = entityManager.unwrap(Session.class);

        currentSession.saveOrUpdate(thePassenger);
    }

    @Override
    @Transactional
    public void deleteById(int theId) {
        Session currentSession = entityManager.unwrap(Session.class);

        Query theQuery = currentSession.createQuery(
                "delete from Passenger where id=:passengerId"
        );

        theQuery.setParameter("passengerId", theId);

        theQuery.executeUpdate();
    }
}
