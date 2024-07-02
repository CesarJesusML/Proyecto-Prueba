	package com.cibertec.gestrestaurante.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cibertec.gestrestaurante.model.Booking;
import com.cibertec.gestrestaurante.repository.BookingRepository;
import com.cibertec.gestrestaurante.service.BookingService;

@Service
public class BookingServiceImpl implements BookingService {

	@Autowired
	BookingRepository bookingRepository;
	
	public Booking create(Booking booking) {
		Booking bookingcreated = new Booking();
		try {
			bookingcreated = bookingRepository.save(booking);
		} catch(Exception e) {
		}
		return bookingcreated;
	} 

	@Override
	public List<Booking> getAll() {
		return bookingRepository.findAll();
	}

	@Override
	public Booking update(Booking booking) {
		return bookingRepository.save(booking);
	}

	@Override
	public void delete(Booking booking) {
		bookingRepository.delete(booking);
	}

	@Override
	public Booking getById(Long id) {
		Optional<Booking> bookingp = bookingRepository.findById(id);
		
		Booking booking = new Booking();
		if (!bookingp.isEmpty()) {
			booking = bookingp.get();
			
	    }
		
		return booking;
	}

}
