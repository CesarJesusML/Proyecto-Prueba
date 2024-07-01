package com.cibertec.gestrestaurante.service;

import java.util.List;

import com.cibertec.gestrestaurante.model.Product;

public interface ProductService {
	Product create(Product product);
	
	List<Product> getAll();
	
	Product update(Product product);
	
	void delete(Product product);

	Product getById(Long id);
}
