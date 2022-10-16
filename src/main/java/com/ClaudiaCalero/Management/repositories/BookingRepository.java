package com.ClaudiaCalero.Management.repositories;

import com.ClaudiaCalero.Management.entities.Booking;
import com.ClaudiaCalero.Management.entities.ActivityClasses;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository

public interface BookingRepository extends JpaRepository<Booking, Integer> {
    List<Booking> findByActivityClasses(ActivityClasses activityClasses);
}
