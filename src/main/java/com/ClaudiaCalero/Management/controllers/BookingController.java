package com.ClaudiaCalero.Management.controllers;

import com.ClaudiaCalero.Management.exceptions.BookingNullException;
import com.ClaudiaCalero.Management.exceptions.BookingServiceException;
import com.ClaudiaCalero.Management.exceptions.BookingsNotFound;
import com.ClaudiaCalero.Management.exceptions.ActivityClassesNotFound;
import com.ClaudiaCalero.Management.entities.Booking;
import com.ClaudiaCalero.Management.entities.ActivityClasses;
import com.ClaudiaCalero.Management.services.BookingService;
import com.ClaudiaCalero.Management.services.ActivityClassesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/bookings")
public class BookingController {
    @Autowired
    BookingService bookingService;

    @Autowired
    ActivityClassesService activityClassesService;


    @GetMapping("/{classId}")
    @ResponseBody
    public List<Booking> getBookingByActivityClasses(@PathVariable int classId) {
        List<Booking> bookings;
        try {
            ActivityClasses activityClasses = activityClassesService.getClassById(classId).orElseThrow(() -> new ActivityClassesNotFound("There is no class found for the given id"));
            bookings = bookingService.findByActivityClass(activityClasses);
            if (bookings.isEmpty())
                throw new BookingsNotFound("There is no booking found for the given class");
        } catch (BookingServiceException e) {
            throw new BookingServiceException("Booking Service Exception: " + e);
        }
        return bookings;
    }


    @PostMapping("")
    @ResponseBody
    public Booking createBookings(@RequestBody Booking booking) {
        try {
            if (booking.getMember_name() == null || booking.getBooking_date() == null)
                throw new BookingNullException("The request has invalid member_name or class date. Check fields.");
            bookingService.save(booking);
        } catch (BookingServiceException e) {
            throw new BookingServiceException("Booking Service Exception: " + e);
        }
        return booking;

    }

}
