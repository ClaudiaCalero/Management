package com.ClaudiaCalero.Management.repositories;

import com.ClaudiaCalero.Management.entities.ActivityClasses;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ActivityClassesRepository extends JpaRepository<ActivityClasses, Integer> {
}

