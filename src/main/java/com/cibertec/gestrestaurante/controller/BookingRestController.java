package com.cibertec.gestrestaurante.controller;

import com.cibertec.gestrestaurante.model.Booking;
import com.cibertec.gestrestaurante.service.BookingService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class BookingRestController {

    @Autowired
    private BookingService bookingService;


    @PostMapping("/api/booking")
    public ResponseEntity<Booking> createBooking(@RequestBody Booking booking ) {
    	
    	bookingService.create(booking);
    	
    	return ResponseEntity.ok(booking);
    }


}
