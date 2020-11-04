package com.havemytrip.flightbooking.dao;

import com.havemytrip.flightbooking.model.Booking;
import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.Table;
import java.util.List;

@Repository
public class BookingDAOImpl implements BookingDAO{

    @Autowired
    private EntityManager entityManager;

    @Override
    @Transactional
    public List<Booking> getAllBookings() {
        Session currentSession = entityManager.unwrap(Session.class);

        Query<Booking> theQuery = currentSession.createQuery("from Booking", Booking.class);

        List<Booking> bookings = theQuery.getResultList();

        return bookings;
    }

    @Override
    @Transactional
    public Booking getById(int bookingId) {
        Session currentSession = entityManager.unwrap(Session.class);

        Booking theBooking = currentSession.get(Booking.class, bookingId);

        return theBooking;
    }

    @Override
    @Transactional
    public void save(Booking theBooking) {
        Session currentSession = entityManager.unwrap(Session.class);

        currentSession.saveOrUpdate(theBooking);
    }

    @Override
    @Transactional
    public void deleteById(int bookingId) {
        Session currentSession = entityManager.unwrap(Session.class);

        Query theQuery = currentSession.createQuery(
                "delete from Booking where id=:bookingId"
        );

        theQuery.setParameter("bookingId", bookingId);

        theQuery.executeUpdate();
    }

    @Override
    @Transactional
    public List<Booking> getByUserId(int theId) {
        Session currentSession = entityManager.unwrap(Session.class);
        Query<Booking> theQuery = currentSession.createQuery("from Booking where user_id = :userId", Booking.class);
        theQuery.setParameter("userId", theId);
        List<Booking> bookingList = theQuery.getResultList();
        return bookingList;
    }
}
