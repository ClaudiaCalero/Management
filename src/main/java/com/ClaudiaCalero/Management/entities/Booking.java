package com.ClaudiaCalero.Management.entities;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.Date;

@Entity
public class Booking {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    int booking_id;

    String member_name;

    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd-MM-yyyy")
    Date booking_date;

    @ManyToOne
    @JsonIgnore
    ActivityClasses activityClasses;

    public Booking() {
    }

    public Booking(int booking_id, String member_name, Date booking_date, ActivityClasses activityClasses) {
        this.booking_id = booking_id;
        this.member_name = member_name;
        this.booking_date = booking_date;
        this.activityClasses = activityClasses;
    }



    public int getBooking_id() {
        return booking_id;
    }

    public void setBooking_id(int booking_id) {
        this.booking_id = booking_id;
    }

    public String getMember_name() {
        return member_name;
    }

    public void setMember_name(String member_name) {
        this.member_name = member_name;
    }

    public Date getBooking_date() {
        return booking_date;
    }

    public void setBooking_date(Date booking_date) {
        this.booking_date = booking_date;
    }

    public ActivityClasses getActivityClasses() {
        return activityClasses;
    }

    public void setActivityClasses(ActivityClasses activityClasses) {
        this.activityClasses = activityClasses;
    }

    @Override
    public String toString() {
        return "Booking: " +
                "booking_id=" + booking_id +
                ", member_name='" + member_name + '\'' +
                ", booking_date='" + booking_date + '\'' +
                '.';
    }


}

