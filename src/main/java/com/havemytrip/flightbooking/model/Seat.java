package com.havemytrip.flightbooking.model;

import javax.persistence.*;

@Entity
@Table(name = "seats")
public class Seat {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "seat_num")
    private int seatNum;

    @Column(name = "class")
    private String classes;

    @ManyToOne
    @JoinColumn(name = "schedule_id")
    private Schedule schedule;

    public Seat() {}

    public Seat(int seatNum, String classes) {
        this.seatNum = seatNum;
        this.classes = classes;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getSeatNum() {
        return seatNum;
    }

    public void setSeatNum(int seatNum) {
        this.seatNum = seatNum;
    }

    public String getClasses() {
        return classes;
    }

    public void setClasses(String classes) {
        this.classes = classes;
    }

    public Schedule getSchedule() {
        return schedule;
    }

    public void setSchedule(Schedule schedule) {
        this.schedule = schedule;
    }

    @Override
    public String toString() {
        return "Seat{" +
                "id=" + id +
                ", classes='" + classes + '\'' +
                '}';
    }

}
