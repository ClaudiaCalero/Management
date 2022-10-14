package com.ClaudiaCalero.Management.services;

import com.ClaudiaCalero.Management.repositories.BookingRepository;
import com.ClaudiaCalero.Management.services.interfaces.BookingServiceInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BookingService implements BookingServiceInterface {
    @Autowired
    BookingRepository bookingRepository;

}
