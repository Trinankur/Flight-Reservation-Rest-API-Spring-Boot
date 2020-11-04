package com.havemytrip.flightbooking.model;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "tickets")
public class Ticket {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "travel_date")
    private String travelDate;

    @Column(name = "phone_no")
    private String phoneNo;

    @Column(name = "email")
    private String email;

    @Column(name = "traverller_num")
    private int travellerNum;

    @Column(name = "paid")
    private int paid;

    public Ticket() {}

    public Ticket(String travelDate, String phoneNo, String email, int travellerNum, int paid) {
        this.travelDate = travelDate;
        this.phoneNo = phoneNo;
        this.email = email;
        this.travellerNum = travellerNum;
        this.paid = paid;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTravelDate() {
        return travelDate;
    }

    public void setTravelDate(String travelDate) {
        this.travelDate = travelDate;
    }

    public String getPhoneNo() {
        return phoneNo;
    }

    public void setPhoneNo(String phoneNo) {
        this.phoneNo = phoneNo;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getPaid() {
        return paid;
    }

    public void setPaid(int paid) {
        this.paid = paid;
    }

    public int getTravellerNum() {
        return travellerNum;
    }

    public void setTravellerNum(int travellerNum) {
        this.travellerNum = travellerNum;
    }

    @Override
    public String toString() {
        return "Ticket{" +
                "id=" + id +
                ", travelDate=" + travelDate +
                ", phoneNo='" + phoneNo + '\'' +
                ", email='" + email + '\'' +
                ", travellerNum=" + travellerNum +
                ", paid=" + paid +
                '}';
    }
}
