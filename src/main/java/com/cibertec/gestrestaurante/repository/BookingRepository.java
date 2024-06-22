package com.cibertec.gestrestaurante.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cibertec.gestrestaurante.model.Booking;

public interface BookingRepository extends JpaRepository<Booking, Integer> {

}
