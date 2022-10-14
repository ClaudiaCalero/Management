package com.ClaudiaCalero.Management.repositories;

import com.ClaudiaCalero.Management.entities.Classes;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClassesRepository extends JpaRepository<Classes, Long> {
}
