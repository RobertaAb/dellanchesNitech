package com.nitech.dellanches.service;

import org.springframework.stereotype.Service;

import com.nitech.dellanches.entity.Product;
import com.nitech.dellanches.repository.ProductRepository;

@Service
public class ProductService {
	ProductRepository productRepository;

	public Product save(Product product) {
		return productRepository.save(product);
	}
}
