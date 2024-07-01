package com.cibertec.gestrestaurante.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cibertec.gestrestaurante.model.Product;
import com.cibertec.gestrestaurante.repository.ProductRepository;
import com.cibertec.gestrestaurante.service.ProductService;

@Service
public class ProductServiceImpl implements ProductService {

	@Autowired
	ProductRepository productRepository;
	
	@Override
	public Product create(Product product) {
		return productRepository.save(product);
	}

	@Override
	public List<Product> getAll() {
		return productRepository.findAll();
	}

	@Override
	public Product update(Product product) {
		return null;
	}

	@Override
	public void delete(Product product) {
		productRepository.delete(product);
	}

	@Override
	public Product getById(Long id) {
		Optional<Product> productop = productRepository.findById(id);
		
		Product product = new Product();
		if (!productop.isEmpty()) {
			product = productop.get();
			
	    }
		
		return product;
	}

}
