package com.havemytrip.flightbooking.dao;

import com.havemytrip.flightbooking.model.Schedule;
import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import java.util.List;

@Repository
public class ScheduleDAOHibernateImpl implements ScheduleDAO {

    @Autowired
    private EntityManager entityManager;


    @Override
    public List<Schedule> getFlightSchedule() {
        Session currentSession = entityManager.unwrap(Session.class);
        Query theQuery = currentSession.createQuery("from Schedule", Schedule.class);

        List<Schedule> scheduleList = theQuery.getResultList();

        return scheduleList;
    }

    @Override
    public List<Schedule> getFlightSchedule(String source, String destination, String dateOfTravel) {
        Session currentSession = entityManager.unwrap(Session.class);
        Query<Schedule> theQuery = currentSession.createQuery("from Schedule where src = :source and dest = :destination and dot = :dateOfTravel", Schedule.class);
        theQuery.setParameter("source", source);
        theQuery.setParameter("destination", destination);
        theQuery.setParameter("dateOfTravel", dateOfTravel);

        List scheduleList = theQuery.list();

        return scheduleList;
    }

    @Override
    public Schedule getById(int theId) {
        Session currentSession = entityManager.unwrap(Session.class);
        Schedule theSchedule = currentSession.get(Schedule.class, theId);
        return theSchedule;
    }

    @Override
    public void addSchedules(List<Schedule> schedules) {
        Session currentSession = entityManager.unwrap(Session.class);
        for(Schedule schedule : schedules) {
            currentSession.saveOrUpdate(schedule);
        }
    }

    @Override
    public void addSchedule(Schedule schedule) {
        Session currentSession = entityManager.unwrap(Session.class);
        currentSession.saveOrUpdate(schedule);
    }

    @Override
    public void deleteSchedule(int scheduleId) {
        Session currentSession = entityManager.unwrap(Session.class);
        Query theQuery = currentSession.createQuery("delete from Schedule where id = :scheduleId");
        theQuery.setParameter("scheduleId", scheduleId);
        theQuery.executeUpdate();
    }
}
