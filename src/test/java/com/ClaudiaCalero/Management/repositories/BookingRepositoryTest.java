/*package com.ClaudiaCalero.Management.repositories;


import com.ClaudiaCalero.Management.entities.ActivityClasses;
import com.ClaudiaCalero.Management.entities.Booking;
import com.ClaudiaCalero.Management.services.BookingService;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Date;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
@DataJpaTest
public class BookingRepositoryTest {

    @Autowired
    BookingService bookingService;

    @Test
    @DisplayName("Returns a list of bookings for the activity classes send by parameter")

    void shouldReturnAListOfBookings(){

        Date booking_date = new Date();
        ActivityClasses activityClass = new ActivityClasses(1, "pilates", booking_date, booking_date, 23);
        Booking booking = new Booking(1, "Clàudia", booking_date, activityClass);

        bookingService.save(booking);
        List<Booking> bookings = bookingService.findByActivityClass(activityClass);

        assertEquals(bookings.size(), 1);
    }


}*/