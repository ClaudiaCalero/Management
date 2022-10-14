package com.ClaudiaCalero.Management.entities;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.time.LocalDate;
import java.util.List;

@Entity
public class Classes {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    //@Column(name = "id", nullable = false)
    private Long id;

    @NotNull
    @NotEmpty
    private String className;

    private LocalDate startDate;
    private LocalDate endDate;

    @NotNull
    private Integer capacity;

    @OneToMany(mappedBy = "classes")
    private List<Booking> bookings;

    public Classes() {
    }

    public Classes(Long id, String className, LocalDate startDate, LocalDate endDate, Integer capacity) {
        this.id = id;
        this.className = className;
        this.startDate = startDate;
        this.endDate = endDate;
        this.capacity = capacity;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }

    public LocalDate getEndDate() {
        return endDate;
    }

    public void setEndDate(LocalDate endDate) {
        this.endDate = endDate;
    }

    public Integer getCapacity() {
        return capacity;
    }

    public void setCapacity(Integer capacity) {
        this.capacity = capacity;
    }

}
