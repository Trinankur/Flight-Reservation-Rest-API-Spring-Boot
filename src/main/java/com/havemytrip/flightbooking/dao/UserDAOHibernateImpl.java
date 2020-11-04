package com.havemytrip.flightbooking.dao;

import com.havemytrip.flightbooking.model.Booking;
import com.havemytrip.flightbooking.model.User;
import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import java.util.List;

@Repository
public class UserDAOHibernateImpl implements UserDAO {

    @Autowired
    private EntityManager entityManager;

    @Override
    public List<User> findAll() {

        Session currentSession = entityManager.unwrap(Session.class);

        Query<User> theQuery = currentSession.createQuery("from User", User.class);

        List<User> users = theQuery.getResultList();

        return users;
    }

    @Override
    public User findById(int theId) {

        Session currentSession = entityManager.unwrap(Session.class);

        User theUser = currentSession.get(User.class, theId);

        return theUser;
    }


    @Override
    public void save(User theUser) {
        Session currentSession = entityManager.unwrap(Session.class);

        currentSession.saveOrUpdate(theUser);
    }

    @Override
    public void deleteById(int theId) {
        Session currentSession = entityManager.unwrap(Session.class);

        Query theQuery = currentSession.createQuery(
                "delete from User where id=:userId"
        );

        theQuery.setParameter("userId", theId);

        theQuery.executeUpdate();
    }
}
