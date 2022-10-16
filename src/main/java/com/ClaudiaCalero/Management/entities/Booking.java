package com.ClaudiaCalero.Management.entities;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.Date;

@Entity
public class Booking {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    int bookingId;

    String memberName;

    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd-MM-yyyy")
    Date bookingDate;

    @ManyToOne
    @JsonIgnore
    ActivityClasses activityClasses;

    public Booking() {
    }

    public Booking(int bookingId, String memberName, Date bookingDate, ActivityClasses activityClasses) {
        this.bookingId = bookingId;
        this.memberName = memberName;
        this.bookingDate = bookingDate;
        this.activityClasses = activityClasses;
    }



    public int getBookingId() {
        return bookingId;
    }

    public void setBookingId(int bookingId) {
        this.bookingId = bookingId;
    }

    public String getMemberName() {
        return memberName;
    }

    public void setMemberName(String memberName) {
        this.memberName = memberName;
    }

    public Date getBookingDate() {
        return bookingDate;
    }

    public void setBookingDate(Date bookingDate) {
        this.bookingDate = bookingDate;
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
                "booking_id=" + bookingId +
                ", member_name='" + memberName + '\'' +
                ", booking_date='" + bookingDate + '\'' +
                '.';
    }


}

