package com.cibertec.gestrestaurante.controller;

import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.cibertec.gestrestaurante.model.User;
import com.cibertec.gestrestaurante.security.MyUserDetails;


@Controller
public class UserController {
	
	@GetMapping("/login")
	public String login(@RequestParam(name = "error", required = false) Boolean error, Model model) {
		if (error != null && error) {
            model.addAttribute("mensajeError", "Credenciales incorrectas. Por favor, inténtelo nuevamente.");
        }
		model.addAttribute("usuario", new User());
		return "login";
	}
	
	@GetMapping("/")
    public String dashboard(@AuthenticationPrincipal MyUserDetails userDetails, Model model) {
        if (userDetails != null) {
            User user = userDetails.getUser();
            
            model.addAttribute("name", user.getUsername());
            model.addAttribute("rol", user.getRole().getName());
        } else {
            return "redirect:/login";
        }
        
        return "index";
    }
}
