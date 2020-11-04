package com.havemytrip.flightbooking.dto.model;

public class FlightDTO {
    private String flightNum;

    private String flightAgency;

    private String src;

    private String dest;

    public FlightDTO() {}

    public FlightDTO(String flightNum, String flightAgency, String src, String dest) {
        this.flightNum = flightNum;
        this.flightAgency = flightAgency;
        this.src = src;
        this.dest = dest;
    }

    public String getFlightNum() {
        return flightNum;
    }

    public void setFlightNum(String flightNum) {
        this.flightNum = flightNum;
    }

    public String getFlightAgency() {
        return flightAgency;
    }

    public void setFlightAgency(String flightAgency) {
        this.flightAgency = flightAgency;
    }

    public String getSrc() {
        return src;
    }

    public void setSrc(String src) {
        this.src = src;
    }

    public String getDest() {
        return dest;
    }

    public void setDest(String dest) {
        this.dest = dest;
    }
}
