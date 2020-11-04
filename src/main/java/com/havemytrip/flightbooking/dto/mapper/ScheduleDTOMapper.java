package com.havemytrip.flightbooking.dto.mapper;

import com.havemytrip.flightbooking.dto.model.ScheduleDTO;
import com.havemytrip.flightbooking.model.Schedule;

public class ScheduleDTOMapper {

    public static ScheduleDTO mapToSchedule(Schedule theSchedule) {
        ScheduleDTO theScheduleDTO = new ScheduleDTO();

        theScheduleDTO.setScheduleId(theSchedule.getId());
        theScheduleDTO.setDot(theSchedule.getDot());
        theScheduleDTO.setSrc(theSchedule.getSrc());
        theScheduleDTO.setDest(theSchedule.getDest());
        theScheduleDTO.setFlight_num(theSchedule.getFlight().getFlightNum());

        return theScheduleDTO;
    }
}
