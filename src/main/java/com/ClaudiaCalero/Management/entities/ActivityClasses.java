package com.ClaudiaCalero.Management.entities;

import com.fasterxml.jackson.annotation.JsonFormat;

import javax.persistence.*;
import java.util.Date;


@Entity
public class ActivityClasses {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    int classId;

    String name;

    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd-MM-yyyy")
    Date startDate;

    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd-MM-yyyy")
    Date endDate;

    int capacity;


    public ActivityClasses() {
    }

    public ActivityClasses(int classId, String name, Date startDate, Date endDate, int capacity) {
        this.classId = classId;
        this.name = this.name;
        this.startDate = startDate;
        this.endDate = endDate;
        this.capacity = capacity;

    }

    public int getClassId() {
        return classId;
    }

    public String getName() {
        return name;
    }

    public Date getStartDate() {
        return startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public int getCapacity() {
        return capacity;
    }



    @Override
    public String toString() {
        return "Activity Class: " +
                "name='" + name + '\'' +
                ", startDate=" + startDate +
                ", endDate=" + endDate +
                ", capacity=" + capacity +
                '.';
    }
}
