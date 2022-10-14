package com.ClaudiaCalero.Management.entities;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.text.DateFormat;

@Entity
public class Booking {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    //@Column(name = "id", nullable = false)
    private Long id;

    @NotEmpty
    private String name;

    @NotNull
    private DateFormat date;

    @ManyToOne

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
