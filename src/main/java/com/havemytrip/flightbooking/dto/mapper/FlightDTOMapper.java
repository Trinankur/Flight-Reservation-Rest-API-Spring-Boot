package com.havemytrip.flightbooking.dto.mapper;

import com.havemytrip.flightbooking.dto.model.FlightDTO;
import com.havemytrip.flightbooking.model.Flight;

public class FlightDTOMapper {
    public static Flight mapToFlight(FlightDTO theFlightDTO) {
        Flight theFlight = new Flight();
        theFlight.setSrc(theFlight.getSrc());
        theFlight.setDest(theFlightDTO.getDest());
        theFlight.setFlightNum(theFlightDTO.getFlightNum());
        theFlight.setFlightAgency(theFlightDTO.getFlightAgency());
        return theFlight;
    }
}
