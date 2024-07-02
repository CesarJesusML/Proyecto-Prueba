package com.cibertec.gestrestaurante.service;

import java.util.List;

import com.cibertec.gestrestaurante.model.Booking;

public interface BookingService {
	Booking create(Booking booking);
	
	List<Booking> getAll();
	
	Booking update(Booking booking);
	
	void delete(Booking booking);

	Booking getById(Long id);
}
