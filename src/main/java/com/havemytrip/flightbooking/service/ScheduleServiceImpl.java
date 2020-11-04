package com.havemytrip.flightbooking.service;

import com.havemytrip.flightbooking.dao.ScheduleDAO;
import com.havemytrip.flightbooking.model.Schedule;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class ScheduleServiceImpl implements ScheduleService {

    @Autowired
    private ScheduleDAO scheduleDAO;

    @Override
    @Transactional
    public List<Schedule> getFlightSchedule() {
        return scheduleDAO.getFlightSchedule();
    }

    @Override
    @Transactional
    public List<Schedule> getFlightSchedule(String source, String destination, String dateOfTravel) {
        return scheduleDAO.getFlightSchedule(source, destination, dateOfTravel);
    }

    @Override
    @Transactional
    public void addSchedules(List<Schedule> schedules) {
        scheduleDAO.addSchedules(schedules);
    }

    @Override
    @Transactional
    public void addSchedule(Schedule schedule) {
        scheduleDAO.addSchedule(schedule);
    }

    @Override
    @Transactional
    public void deleteSchedule(int scheduleId) {
        scheduleDAO.deleteSchedule(scheduleId);
    }

    @Override
    public Schedule getById(int theId) {
        return scheduleDAO.getById(theId);
    }
}
