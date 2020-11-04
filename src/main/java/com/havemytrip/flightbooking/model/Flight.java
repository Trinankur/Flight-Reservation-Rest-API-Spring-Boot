package com.havemytrip.flightbooking.model;

import javax.persistence.*;

@Entity
@Table(name = "flights")
public class Flight {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "flight_num")
    private String flightNum;

    @Column(name = "flight_agency")
    private String flightAgency;

    @Column(name = "src")
    private String src;

    @Column(name = "dest")
    private String dest;

    public Flight() {}

    public Flight(String flightNum, String src, String dest) {
        this.flightNum = flightNum;
        this.src = src;
        this.dest = dest;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    @Override
    public String toString() {
        return "Flight{" +
                "id=" + id +
                ", flightNum='" + flightNum + '\'' +
                ", src='" + src + '\'' +
                ", dest='" + dest + '\'' +
                '}';
    }

}
