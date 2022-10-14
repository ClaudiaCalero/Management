package com.ClaudiaCalero.Management.repositories;

import com.ClaudiaCalero.Management.entities.Booking;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookingRepository extends JpaRepository<Booking, Long> {
}
