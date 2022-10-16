package com.ClaudiaCalero.Management.services;

import com.ClaudiaCalero.Management.entities.ActivityClasses;
import com.ClaudiaCalero.Management.entities.Booking;
import com.ClaudiaCalero.Management.repositories.BookingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookingService {


    @Autowired
    BookingRepository bookingRepository;

    public void save(Booking booking) {
        bookingRepository.save(booking);
    }

    public List<Booking> findByActivityClass(ActivityClasses classId) {

        return bookingRepository.findByActivityClasses(classId);
    }
}


