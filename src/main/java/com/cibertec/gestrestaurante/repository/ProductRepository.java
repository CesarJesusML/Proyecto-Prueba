package com.cibertec.gestrestaurante.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cibertec.gestrestaurante.model.Product;

public interface ProductRepository extends JpaRepository<Product, Integer> {

}
