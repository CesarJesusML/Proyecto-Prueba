package com.cibertec.gestrestaurante.repository;


import org.springframework.data.jpa.repository.JpaRepository;

import com.cibertec.gestrestaurante.model.User;


public interface UserRepository extends JpaRepository<User, Long> {
	User findByUsername(String username);



} 
