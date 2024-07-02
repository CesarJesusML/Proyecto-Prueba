package com.cibertec.gestrestaurante.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.cibertec.gestrestaurante.model.Booking;

@Controller
public class BookingViewController {

    @GetMapping("/crear-reserva")
    public String showBookingForm(Model model) {
        model.addAttribute("booking", new Booking());
        return "Booking/form";
    }
}
