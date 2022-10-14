package com.ClaudiaCalero.Management.entities;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.time.LocalDate;

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

    @OneToMany

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
