package com.cibertec.gestrestaurante.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cibertec.gestrestaurante.model.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

	Optional<Product> findById(Long id);
	
}
