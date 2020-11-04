package com.havemytrip.flightbooking.dao;

import com.havemytrip.flightbooking.model.Schedule;

import java.util.List;

public interface ScheduleDAO {
    public List<Schedule> getFlightSchedule();
    public List<Schedule> getFlightSchedule(String source, String destination, String dateOfTravel);
    public Schedule getById(int theId);
    public void addSchedules(List<Schedule> schedules);
    public void addSchedule(Schedule schedule);
    public void deleteSchedule(int scheduleId);
}
