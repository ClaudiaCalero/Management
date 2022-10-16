package com.ClaudiaCalero.Management.entities;

import com.fasterxml.jackson.annotation.JsonFormat;

import javax.persistence.*;
import java.util.Date;


@Entity
public class ActivityClasses {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    int class_id;

    String name;

    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd-MM-yyyy")
    Date start_date;

    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd-MM-yyyy")
    Date end_date;

    int capacity;


    public ActivityClasses() {
    }

    public ActivityClasses(int class_id, String name, Date start_date, Date end_date, int capacity) {
        this.class_id = class_id;
        this.name = this.name;
        this.start_date = start_date;
        this.end_date = end_date;
        this.capacity = capacity;

    }

    public int getClass_id() {
        return class_id;
    }

    public String getName() {
        return name;
    }

    public Date getStart_date() {
        return start_date;
    }

    public Date getEnd_date() {
        return end_date;
    }

    public int getCapacity() {
        return capacity;
    }



    @Override
    public String toString() {
        return "Activity Gym Class: " +
                "name='" + name + '\'' +
                ", start_date=" + start_date +
                ", end_date=" + end_date +
                ", capacity=" + capacity +
                '.';
    }
}
