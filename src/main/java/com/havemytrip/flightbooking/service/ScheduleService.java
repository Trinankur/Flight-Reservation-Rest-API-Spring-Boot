package com.havemytrip.flightbooking.service;

import com.havemytrip.flightbooking.model.Schedule;

import java.util.Date;
import java.util.List;

public interface ScheduleService {
    public List<Schedule> getFlightSchedule();
    public List<Schedule> getFlightSchedule(String source, String destination, String dateOfTravel);
    public void addSchedules(List<Schedule> schedules);
    public void addSchedule(Schedule schedule);
    public void deleteSchedule(int scheduleId);
    public Schedule getById(int theId);
}
