package com.havemytrip.flightbooking.controller_v1;

import com.havemytrip.flightbooking.dto.mapper.FlightDTOMapper;
import com.havemytrip.flightbooking.dto.mapper.ScheduleDTOMapper;
import com.havemytrip.flightbooking.dto.model.FlightDTO;
import com.havemytrip.flightbooking.dto.model.ScheduleDTO;
import com.havemytrip.flightbooking.model.Flight;
import com.havemytrip.flightbooking.model.Schedule;
import com.havemytrip.flightbooking.model.User;
import com.havemytrip.flightbooking.service.FlightService;
import com.havemytrip.flightbooking.service.ScheduleService;
import com.havemytrip.flightbooking.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/admin")
public class AdminController {

    @Autowired
    private ScheduleService scheduleService;

    @Autowired
    private FlightService flightService;

    @Autowired
    private UserService userService;

    @GetMapping("/users")
    public List<User> getUsers() {
        return userService.findAll();
    }

    @GetMapping("/flightSchedule")
    public List<Schedule> getFlightSchedule() {
        return scheduleService.getFlightSchedule();
    }

    @GetMapping("/flights")
    public List<Flight> getFlights() { return flightService.getFlights(); }


}
