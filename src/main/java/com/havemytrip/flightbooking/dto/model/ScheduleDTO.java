package com.havemytrip.flightbooking.dto.model;

import java.util.Date;

public class ScheduleDTO {

    private int scheduleId;
    private String flight_num;
    private String src;
    private String dest;
    private String dot;

    public ScheduleDTO() {}

    public ScheduleDTO(int scheduleId, String flight_num, String src, String dest, String dot) {
        this.scheduleId = scheduleId;
        this.flight_num = flight_num;
        this.src = src;
        this.dest = dest;
        this.dot = dot;
    }

    public int getScheduleId() {
        return scheduleId;
    }

    public void setScheduleId(int scheduleId) {
        this.scheduleId = scheduleId;
    }

    public String getFlight_num() {
        return flight_num;
    }

    public void setFlight_num(String flight_num) {
        this.flight_num = flight_num;
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

    public String getDot() {
        return dot;
    }

    public void setDot(String dot) {
        this.dot = dot;
    }

    @Override
    public String toString() {
        return "ScheduleDTO{" +
                "flight_num='" + flight_num + '\'' +
                ", src='" + src + '\'' +
                ", dest='" + dest + '\'' +
                ", dot='" + dot + '\'' +
                '}';
    }
}
