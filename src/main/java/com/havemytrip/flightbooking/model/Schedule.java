package com.havemytrip.flightbooking.model;

import javax.persistence.*;

@Entity
@Table(name = "schedules")
public class Schedule {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "src")
    private String src;

    @Column(name = "dest")
    private String dest;

    @Column(name = "dot")
    private String dot;

    @ManyToOne
    @JoinColumn(name = "flight_id")
    private Flight flight;

    public Schedule() {

    }

    public Schedule(int id, String src, String dest, String dot) {
        this.id = id;
        this.src = src;
        this.dest = dest;
        this.dot = dot;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public Flight getFlight() {
        return flight;
    }

    public void setFlight(Flight flight) {
        this.flight = flight;
    }

}
