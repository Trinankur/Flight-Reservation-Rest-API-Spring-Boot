package com.havemytrip.flightbooking.controller_v1;

import com.havemytrip.flightbooking.dao.*;
import com.havemytrip.flightbooking.model.*;
import com.havemytrip.flightbooking.service.ScheduleService;
import com.havemytrip.flightbooking.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/api")
public class BookingController {

    @Autowired
    private UserService userService;

    @Autowired
    private TicketDAO ticketDAO;

    @Autowired
    private BookingDAO bookingDAO;

    @Autowired
    private ScheduleService scheduleService;

    @Autowired
    private PassengerDAO passengerDAO;

    @Autowired
    private SeatDAO seatDAO;

    @PostMapping("/user/{userId}/flight/{scheduleId}/book")
    public void bookTicket(@PathVariable int userId, @PathVariable int scheduleId, @RequestBody List<Passenger> passengerList, @RequestParam String email, @RequestParam String phoneNo) {
        Schedule theSchedule = scheduleService.getById(scheduleId);

        Ticket theTicket = new Ticket();
        theTicket.setEmail(email);
        theTicket.setPaid(1);
        theTicket.setPhoneNo(phoneNo);
        theTicket.setTravelDate(theSchedule.getDot());
        theTicket.setTravellerNum(passengerList.size());
        ticketDAO.save(theTicket);

        System.out.println(theTicket);

        int i = 0;
        for(Passenger thePassenger : passengerList) {
            thePassenger.setFlight(theSchedule.getFlight());
            thePassenger.setTicket(theTicket);
            thePassenger.setSeat(seatDAO.getById(++i));
            passengerDAO.save(thePassenger);
        }

        User theUser = userService.findById(userId);

        Booking theBooking = new Booking();
        theBooking.setUser(theUser);
        theBooking.setTicket(theTicket);
        theBooking.setComplete(0);
        bookingDAO.save(theBooking);

    }

    @GetMapping("/user/{userId}/booking")
    public List<Booking> showBookings(@PathVariable int userId) {
        return bookingDAO.getByUserId(userId);
    }

}
